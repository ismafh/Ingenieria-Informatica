package epsa.iferher.practica3;



public class Juego {
    private int codigo;
    private String nombre;
    private int minjugadores;
    private int maxjugadores;
    private boolean activo;
    private static int numjuegosact;

    public Juego(int codigo,String nombre,int minjugadores,int maxjugadores,boolean activo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.minjugadores=minjugadores;
        this.maxjugadores=maxjugadores;
        this.activo=activo;
    }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinjugadores() {
        return this.minjugadores;
    }

    public void setMinjugadores(int minjugadores) {
        this.minjugadores = minjugadores;
    }

    public int getMaxjugadores() {
        return this.maxjugadores;
    }

    public void setMaxjugadores(int maxjugadores) {
        this.maxjugadores = maxjugadores;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        if (activo){numjuegosact++;}
        else{numjuegosact--;}
        this.activo = activo;
    }
    public static int getNumjuegosact(){
        return numjuegosact;
    }

    
    public String toString() {
        return 
            "\nCodigo='" + getCodigo() + "'" +
            ", \nNombre='" + getNombre() + "'" +
            ", \nMinjugadores='" + getMinjugadores() + "'" +
            ", \nMaxjugadores='" + getMaxjugadores() + "'" +
            ", \nActivo='" + isActivo() + "'" +
            "\n************************";
    }

  

}
