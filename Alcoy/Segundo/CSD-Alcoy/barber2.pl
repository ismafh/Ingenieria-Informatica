#!/usr/bin/env perl
use warnings;
use strict;
use threads;
use threads::shared;
use Thread::Semaphore;
use Time::HiRes qw (time usleep);

my $TBAS= 100_000;  # factor de tiempo base común
my $FMIC=  2;       # factor de tiempo mínimo de creación
my $FMAC= 20;       # factor de tiempo máximo de creación
my $FMIO=  5;       # factor de tiempo mínimo de operación
my $FMAO= 20;       # factor de tiempo máximo de operación
my $TMIC= $TBAS*$FMIC; # tiempo mínimo de creación
my $TMAC= $TBAS*$FMAC; # tiempo máximo de creación
my $TMIO= $TBAS*$FMIO; # tiempo mínimo de operación
my $TMAO= $TBAS*$FMAO; # tiempo máximo de operación

my $SILLONES= 1;
my $SILLAS= 3;
my $AFORO= $SILLONES+$SILLAS;


my $despertar=Thread::Semaphore->new(0);      #Despertar al barbero si esta en una siesta
my $sillonLibre=Thread::Semaphore->new(0);    #El barbero empieza sentado 
my $esperarSilla=Thread::Semaphore->new(3);   #Al estar el sillón ocupado, el cliente espera en una silla
my $esperarPedido=Thread::Semaphore->new(0);  #Barbero esperar a un pedido por parte de un cliente
my $sentarse=Thread::Semaphore->new(1);       #Cliente trata de sentarse en el sillón
my $atendido=Thread::Semaphore->new(0);       #El barbero avisa que ha atendido al cliente


my $print_def= select(STDOUT);
$|= 1; # autoflush STDOUT
select(STDERR);
$|= 1; # autoflush STDERR
select($print_def);

srand(); # Inicializa el aleatorio

my $stop : shared= 0; # variable para cerrar la barberia 
my $ncli : shared= 0; # numero de clientes en la barberia
my $nsillas: shared= 0; # numero de clientes esperando en las sillas
my $sillo: shared= 0; # variable para saber quien está sentado en el sillón
my $cliat: shared= 0; # acumulado de clientes atendidos
my $clina: shared= 0; # acumulado de clientes no atendidos
my $siestas: shared= 0; # acumulado de siestas del barbero
my $despertado: shared=0; #Indica si el barbero esta durmiendo
my $turnos: shared=1; #Turno del cliente
my $stopCreatingThreads: shared=0;
my $clitot: shared =0; #Total clientes

print "*** Versión previa a implementaciones ***\n";
print "Esqueleto de versió inicial del barber\n";

my $tb= threads->create(\&barbero,-1);
my $c= 0; # número de cliente a generar

while (!$stop) {
  while(!$stopCreatingThreads){
      threads->create(\&cliente,++$c);
      usleep(alea($TMIC,$TMAC));
      $SIG{INT} = \&cerrarBarberia;
      $SIG{TSTP} = \&estadisticas;
  }
  if($ncli<=0){
    ++$stop;
  }

}

$tb->join;
print "*** Simulación finalizada ***\n";
estadisticas();
exit(0);

sub barbero {
  my ($b)= @_;
  print "*** Barberia abierta ***\n";
  while (!$stop) {
    dormir();
     while ($ncli > 0) {
      $esperarPedido->down();#   esperar pedido
      atender(); #   atender al cliente
      $atendido->up();#   avisar al cliente servido
      $sillonLibre->down();#   esperar que se libere el sillón
     }
  } 
  print "*** Barberia cerrada ***\n";
}

sub cliente {
  my ($c)= @_;
  threads->detach(); # no es necesario esperar al cliente
  print "-> Entra cliente $c\n";
  ++$clitot;
   if ($ncli < $AFORO) { # entra para ser atendido 
    ++$ncli;
     if ($sillo > 0) { # barbero trabajando
        esperarSilla();#     esperar en silla
     } elsif ($sillo < 0) { # barbero durmiendo
          despertar(); #despertar al barbero
          $sillonLibre->down(); #esperar liberación del sillón
     }     
      while($turnos!=$c){

      }
      $sillo=$c;
      $sentarse->down();
      print"Cliente $c sentado en sillón ($nsillas en sillas)\n"; #   sentarse 
      $esperarPedido->up();#y pedir al barbero el servicio
      $atendido->down(); #   esperar ser servido por el barbero
      ++$cliat;
      avisarCliente();#   avisar si hay cliente a las sillas
      print "<- Sale atendido cliente $c [$cliat : $clina]\n";#   irse sin pagar ;-)
      ++$turnos; #El turno pasa a ser del siguiente cliente
   } else{
      ++$clina;
      print "<- Sale sin ser atendido cliente $c [$cliat : $clina]\n";
      while($c!=$turnos){

      }
      ++$turnos;
      
   } 
}

sub alea {
  (my $min, my $max)= @_;
  return ($min+int(rand($max-$min+1)));
} # Devuelve un aleatorio entre el intervalo [$min,$max] recibido como argumento

sub dormir{
  while($despertado==0){
     if($sillo==0){
      $sillo=-1;
      ++$siestas;
      print "*Barbero descansando [$siestas]\n";
      $despertar->down();
    }elsif($sillo==-1){
      print "*Barbero despertado\n";
      $despertado=1;
      $sillo=0;
      $sillonLibre->up();
    }
  }
 
  
}



sub atender{
  if($sillo>0){
     print "* Barbero atendiendo a cliente $sillo\n";
     usleep(alea($TMIC,$TMAC));
  }
 
}

sub esperarSilla{
  ++$nsillas;
  print("Cliente $c, sentado en silla ($nsillas en sillas)\n");
  $esperarSilla->down();
 
}

sub despertar{
  $despertado=0;
  $despertar->up();
}

sub avisarCliente{
  --$ncli;
  if($nsillas>0){
    --$nsillas;
  }
  $sentarse->up(); #El cliente atendido se levanta
  $sillonLibre->up(); #Deja el sillón libre para el próximo cliente o para que duerma el babero
  $esperarSilla->up(); #Se avisa al cliente sntado en silla que es su turno
  if($ncli==0){
    $sillo=0;      #El sillón será ocupado por nadie
    $despertado=0; #El barbero se dormirá
  }
 
}

sub estadisticas{
  print "Se han generado $clitot clientes, siendo atendidos $cliat \n"; 
  print "mientras que $clina han tenido que abandonar la barberia.\n";
  print "El barbero ha podido echar $siestas siestas\n";
}

sub cerrarBarberia{
  print("Has pulsado ^C y pongo el cartel de cerrado...");
  ++$stopCreatingThreads;
  
}
