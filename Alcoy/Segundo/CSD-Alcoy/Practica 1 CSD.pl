#!/usr/bin/env perl

use threads;
use threads::shared;

use Time::HiRes qw (time);

my $max= 1E8;
$max--;


$m1=$max/4;
$m2=$max/2;
$m3=$m1+$m2;

my $ti= time();

$t1= threads->create(\&funcio1);
$t2= threads->create(\&funcio2);
$t3= threads->create(\&funcio3);
$t4= threads->create(\&funcio4);

my $condicion1=$t1->join();
my $condicion2=$t2->join();
my $condicion3=$t3->join();
my $condicion4=$t4->join();


my $bonics=$condicion1+ $condicion2+$condicion3+$condicion4;
print ("Entre 0 i $max hi ha $bonics números bonics.\n");
my $s= time()-$ti;
print ("Càlculs realitzats en $s segons.\n");
sub funcio1{

for my $num (0..$m1) {
my $condicion1=0;
  my $cont= 0; 
  $cont++ if ($num%5 == 0);
  $cont++ if ($num%7 == 2);
  $cont++ if ($num%9 == 0);
  $condicion1++ if ($cont == 1);
 
}return $condicion1;
}
sub funcio2{
my $condicion2=0;
for my $num ($m1+1..$m2) {
  my $cont= 0; 
  $cont++ if ($num%5 == 0);
  $cont++ if ($num%7 == 2);
  $cont++ if ($num%9 == 0);
  $condicion2++ if ($cont == 1);
}return $condicion2;}
sub funcio3{

for my $num ($m2+1..$m3) {
my $condicion3=0;
  my $cont= 0; 
  $cont++ if ($num%5 == 0);
  $cont++ if ($num%7 == 2);
  $cont++ if ($num%9 == 0);
  $condicion3++ if ($cont == 1);
}return $condicion3;}
sub funcio4{

for my $num ($m3+1..$max) {
my $condicion4=0;
  my $cont= 0; 
  $cont++ if ($num%5 == 0);
  $cont++ if ($num%7 == 2);
  $cont++ if ($num%9 == 0);
  $condicion1++ if ($cont == 1);
 
}return $condicion4;
}


