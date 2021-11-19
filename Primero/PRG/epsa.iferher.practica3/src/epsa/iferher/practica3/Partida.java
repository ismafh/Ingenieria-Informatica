package epsa.iferher.practica3;

import java.util.Arrays;
public class Partida {
    private Juego juego;
    private int numerojugadores;
    private boolean iniciada;
    private Jugador jugador[];





    public Partida(Juego juego, int numerojugadores, boolean iniciada, Jugador jugador[]) {
        this.juego = juego;
        this.numerojugadores = numerojugadores;
        this.iniciada = iniciada;
        this.jugador = jugador;
    }

    public void anyadirJugador(Jugador x){
        boolean esta = false;
        for (int i=0; i<numerojugadores;i++){
            if (x.getID().equals(jugador[i].getID())){
                esta=true;
            }
        }
        if (!esta && !x.getSancionado()){
            jugador=Arrays.copyOf(jugador, numerojugadores+1);
            jugador[numerojugadores]=x;
            numerojugadores++;
            System.out.println("Jugador a�adido correctamente");
        }
        else if (!esta){System.out.println("Este jugador esta sancionado y por tanto no se le ha a�addido");}
        else{System.out.println("Ese jugador ya est� en la lista");}
    }

    public Juego getJuego() {
        return this.juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getNumerojugadores() {
        return this.numerojugadores;
    }

    public void setNumerojugadores(int numerojugadores) {
        this.numerojugadores = numerojugadores;
    }

    public boolean isIniciada() {
        return this.iniciada;
    }

   

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }

    public Jugador[] getjugador() {
        return this.jugador;
    }
    
    public String nombresDeJugadores(){
        String aux = "";
        for  (int x=0; x<numerojugadores; x++){
            aux+= jugador[x].getAlias();
            if (x!=numerojugadores - 1){aux+= "\n";}
        } 


        return aux;
    }


    
    public String toString() {
        return "{" +
            " Nombre del juego='" + getJuego().getNombre() + "'" +
            ", \nNumero de jugadores='" + getNumerojugadores() + "'" +
            ", \nIniciada='" + isIniciada() + "'" +
            ", \nLista de jugadores='" + nombresDeJugadores() + "'" +
            "}";
    }
  


}