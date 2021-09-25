package epsa.iferher.practica3;

import java.util.Arrays;
import java.util.Scanner;



public class GestorPartida{

    private int numjuegos;
    private int numerojugadores;
    private Juego listaJuegos[] = new Juego[numjuegos];
    private Jugador listajugadores[] = new Jugador[numerojugadores];
    
    public static void main(String[] args) {
        GestorPartida x = new GestorPartida();
        x.menu();
    }








    //MENUS
    public void menu(){
        Scanner tec = new Scanner(System.in);
        System.out.println("--------MENU PRINCIPAL--------");
        System.out.println("1.Jugadores");
        System.out.println("2.Juegos");
        System.out.println("3.Partidas");
        System.out.println("0.Salir");
        System.out.println("\nItroduce la opcion deseada");
        int seleccion=tec.nextInt();
        Juego naruto = new Juego(-1,"no has seleccionado juego",0,0,false);
        Jugador [] aux = new Jugador [0];
        Partida x = new Partida(naruto, 0, false, aux);
        switch(seleccion){
            case 0: System.out.println("Cerrando el programa");
                System.exit(0);
            break;

            case 1: menujugadores();
            break;

            case 2: menujuegos();
            break;

            case 3: menupartidas(x);
            break;
            
            
            default:System.out.println("Esa opcion no esta en la lista, introduce un numero correcto");menu();
            break;
        }

        tec.close();
    }

    public void menujugadores(){
        Scanner tec = new Scanner(System.in);
        System.out.println("--------MENU JUGADORES--------");
        System.out.println("1.Alta jugador");
        System.out.println("2.Sancionar jugador");
        System.out.println("3.Quitar sancion jugador");
        System.out.println("4.Lista de jugadores");
        System.out.println("0.Volver al menu principal");
        System.out.println("\nItroduce la opcion deseada");
        int seleccion=tec.nextInt();
        tec.nextLine();

        switch(seleccion){
            case 0: menu();
            break;

            case 1: nuevojugador();menujugadores();
            break;

            case 2: sancionar(tec);menujugadores();
            break;

            case 3: quitarsancion(tec);menujugadores();
            break;

            case 4: listarjugadores();menujugadores();
            break;
            
            

            default: System.out.println("Esa opcion no esta en la lista, introduce un numero correcto");menujugadores();
            break;

        }

        tec.close();
    }

    public void menupartidas(Partida x){

        Scanner tec = new Scanner(System.in);
        System.out.println("--------MENU PARTIDAS--------");
        System.out.println("1.Seleccionar juego");
        System.out.println("2.Añadir jugador a juego");
        System.out.println("3.Listar datos de partida");
        System.out.println("4.Jugar");
        System.out.println("0.Volver al Menu Principal");
        System.out.println("\nIntroduce la opcion deseada");
        int seleccion=tec.nextInt();
        tec.nextLine();
        switch(seleccion){
            case 0: menu();
            break;

            case 1: Juego l = selecc(tec); if (l!=null){x.setJuego(l);}menupartidas(x);
            break;
            case 2: System.out.println("Introduce el ID del usario a añadir");
            String ID=tec.nextLine();
            int i=0;
            boolean existe=false;
            while(!existe && i<numerojugadores){
                if(listajugadores[i].getID().equals(ID)){
                    existe=true;
                }
                i++;
            }
            if(existe){x.añadirJugador(listajugadores[i-1]);}
            else {System.out.println("Ese jugador no existe");}
            menupartidas(x);
            break;
            
            case 3: System.out.println(x.toString());menupartidas(x);
            break;

            case 4: Jugar(x);
            break;

            default: System.out.println("Esa opcion no esta en la lista, introduce un numero correcto");menupartidas(x);
            break;
        }

        tec.close();
    }

    public void menujuegos(){
        Scanner tec = new Scanner(System.in);
        System.out.println("--------MENU JUEGOS--------");
        System.out.println("1.Alta juego");
        System.out.println("2.Activar juego");
        System.out.println("3.Desactivar juego");
        System.out.println("4.Listar juegos");
        System.out.println("0.Volver al Menu Principal");
        System.out.println("\nItroduce la opcion deseada");
        int seleccion=tec.nextInt();
        

        switch(seleccion){
            case 0: menu();
            break;

            case 1: nuevojuego();menujuegos();
            break;

            case 2: activar(tec);menujuegos();
            break;

            case 3: desactivar(tec);menujuegos();
            break;

            case 4: listarjuegos();menujuegos();
            break;
            

            default: System.out.println("Esa opcion no esta en la lista, introduce un numero correcto");menujuegos();
            break;


        }
        tec.close();
    }

    // Metodos

    public void  nuevojugador(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce los datos de el jugador");
        System.out.println("\nID: ");
        String ID = tec.nextLine();
        if (existeID(ID)){System.out.println("ID ya en uso");}
        else{
            System.out.println("\nNombre: ");
            String nombre = tec.nextLine();
            System.out.println("\nAlias: ");
            String alias =tec.nextLine();
            System.out.println("\n Sancionado(true o false): ");
            boolean sancionado = tec.nextBoolean();tec.nextLine();

            

            Jugador aux = new Jugador(ID, nombre, alias, sancionado);



            listajugadores=Arrays.copyOf(listajugadores, numerojugadores+1);

            listajugadores[numerojugadores]=aux;
            numerojugadores++;
            
        }
    }

    public void listarjugadores(){
        System.out.println("      LISTADO DE JUGADORES      ");
        System.out.println("-----------------------------");
        for  (int x=0; x<listajugadores.length; x++)
        System.out.println(listajugadores[x].toString());
    }

    public void  nuevojuego(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce los datos del juego");
        System.out.println("\nCodigo: ");
        int codigo = tec.nextInt();tec.nextLine();
        if (existecodigo(codigo)){
            System.out.println("\nNombre: ");
            String nombre = tec.nextLine();
            System.out.println("\nMnimo de jugadores: ");
            int minjugadores =tec.nextInt();
            System.out.println("\n Maximo de jugadores: ");
            int maxjugadores = tec.nextInt();tec.nextLine();
            boolean activo=false;

            
            
            Juego aux = new Juego(codigo, nombre, minjugadores, maxjugadores, activo);


            listaJuegos=Arrays.copyOf(listaJuegos, numjuegos+1);

            listaJuegos[numjuegos]=aux;
            
            numjuegos++;
        }
        else{System.out.println("Código inválido");}
    }

    public void listarjuegos(){
        System.out.println("      LISTADO DE JUEGOS      ");
        System.out.println("-----------------------------");
        for  (int x=0; x<listaJuegos.length; x++)
        System.out.println(listaJuegos[x].toString());
    }

    public void sancionar(Scanner tec){
        
        System.out.println("Introduce la ID del jugador a sancionar");
        String ID=tec.nextLine();
        int i=0;
        boolean existe=false;
        while(!existe && i<numerojugadores){
            if(listajugadores[i].getID().equals(ID)){
                existe=true;
            }
            i++;
        }
        if(existe && !listajugadores[i-1].getSancionado()){
            listajugadores[i-1].setSancionado(true);
            System.out.println("Jugador sancionado correctamente");
        }
        else if (existe){
            System.out.println("Este jugador ya está sancionado");
        }
        else{System.out.println("No existe un jugador con esa ID");}
        
    }
    public void quitarsancion(Scanner tec){
        
        System.out.println("Introduce la ID del jugador a sancionar");
        String ID=tec.nextLine();
        int i=0;
        boolean existe=false;
        while(!existe && i<numerojugadores){
            if(listajugadores[i].getID().equals(ID)){
                existe=true;
            }
            i++;
        }
        if(existe && listajugadores[i-1].getSancionado()){
            listajugadores[i-1].setSancionado(false);
            System.out.println("Sancion quitada correctamente");
        }
        else if (existe){
            System.out.println("Este jugador ya está sin sancionar");
        }
        else{System.out.println("No existe un jugador con esa ID");}
        
    }
    //Devuelve true si ya hay un jugador con esa ID, false en el caso contrario
    public boolean existeID(String ID){
        int i=0;
        boolean existe=false;
        while(!existe && i<numerojugadores){
            if(listajugadores[i].getID().equals(ID)){
                existe=true;
            }
            i++;
        }
        return existe;
    }
    //Te devuelve null si el juego no existe, en caso contrario te devuelve el juego seleccionado
    public Juego selecc(Scanner tec){
        Juego juego = null;
        if(Juego.getNumjuegosact()==0){System.out.println("No hay ningún juego activo");return juego;}
        else{
            System.out.println("Introduce el codigo del juego que quieras seleccionar");
            int codigo=tec.nextInt();
            tec.nextLine();
            int i=0;
            boolean existe=false;
            while(!existe && i<numjuegos){
                if(listaJuegos[i].getCodigo()==codigo){
                    existe=true;
                    
                }
                i++;
                
            }
            if (existe&&listaJuegos[i-1].getActivo()){juego = listaJuegos[i-1];return juego;}
            else if (existe){System.out.println("Este juego no está activo");}
            else{System.out.println("Este juego no existe");}
            return juego;
        }
    }

    public void activar(Scanner tec){
        System.out.println("Introduce el codigo del Juego a activar");
        int codigo=tec.nextInt();
        int i=0;
        boolean existe=false;
        while(!existe && i<numjuegos){
            if(listaJuegos[i].getCodigo()==codigo){
                existe=true;
            }
            i++;
        }
        if(existe && !listaJuegos[i-1].getActivo()){
            listaJuegos[i-1].setActivo(true);
            System.out.println("Juego activado correctamente");
        }
        else if (existe){
            System.out.println("Este juego ya esta activado");
        }
        else{System.out.println("No existe un juego con ese codigo");}
    }

    public void desactivar(Scanner tec){
        
        System.out.println("Introduce la ID del jugador a sancionar");
        int codigo=tec.nextInt();
        int i=0;
        boolean existe=false;
        while(!existe && i<numjuegos){
            if(listaJuegos[i].getCodigo()==codigo){
                existe=true;
            }
            i++;
        }
        if(existe && listaJuegos[i-1].getActivo()){
            listaJuegos[i-1].setActivo(false);
            System.out.println("Juego desactivado correctamente");
        }
        else if (existe){
            System.out.println("Este juego ya esta desactivado");
        }
        else{System.out.println("No existe un juego con ese codigo");}
        
    }

    //Devuelve true si ya hay un juego con ese codigo, false en el caso contrario
    public boolean existecodigo(int codigo){
        int i=0;
        boolean existe=false;
        while(!existe && i<numerojugadores && codigo >= 0){
            if(listaJuegos[i].getCodigo()==codigo){
                existe=true;
            }
            i++;
        }
        return existe;
    }
    public void Jugar(Partida x){
        if (x.getJuego().getCodigo()==-1){System.out.println("no has elegido juego");menupartidas(x);}
        else if (x.getNumerojugadores()>x.getJuego().getMaxjugadores()){System.out.println("Hay más jugadores que el máximo, vuelve al menu para reiniciar las opciones de partida");menupartidas(x);}
        else if (x.getNumerojugadores()<x.getJuego().getMinjugadores()){System.out.println("Hay menos jugadores que el mínimo,!AÑADE MAS!");menupartidas(x);}
        else {x.setIniciada(true);}
        System.out.println("Partida iniciada = "+x.isIniciada());
        Scanner tec = new Scanner(System.in);
        System.out.println("Felicidades, estás jugando, cuando quieras parar de jugar escribe 0");
        while(true){
        int m = tec.nextInt();
        tec.nextLine();
        if (m==0){System.exit(0);}
        else{System.out.println("Ese número no es 0");}
        }
    }   
}