package Examenes;
public class Coche extends Vehiculo{
    String color;
    int edad;
    public Coche(String color,int edad,String nombre,String marca,int km){
        super(nombre, marca, km);
        this.color=color;
        this.edad=edad;
    }
    public  void  toString1(){      
        System.out.println("Coche: " + this.nombre + " Marca: " + this.marca); //se invoca el método toString de la clase Coche                  
    }
}