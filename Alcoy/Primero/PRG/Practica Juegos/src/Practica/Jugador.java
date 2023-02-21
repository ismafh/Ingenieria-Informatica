package Practica;



public class Jugador {
    private String ID;
    private String nombre;
    private String alias;
    private boolean sancionado;

    public Jugador(String ID,String nombre,String alias,boolean sancionado){
        this.ID=ID;
        this.nombre=nombre;
        this.alias=alias;
        this.sancionado=sancionado;
    }


    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public boolean isSancionado() {
        return this.sancionado;
    }

    public boolean getSancionado() {
        return this.sancionado;
    }

    public void setSancionado(boolean sancionado) {
        this.sancionado = sancionado;
    }

    
    public String toString() {
        return  
            "ID='" + getID() + "'" +
            ", \nNombre='" + getNombre() + "'" +
            ", \nAlias='" + getAlias() + "'" +
            ", \nSancionado='" + isSancionado() + "'" +
            "\n************************";

            
    }

   


  
   
}
