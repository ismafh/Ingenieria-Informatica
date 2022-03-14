package Examenes;
import java.util.ArrayList;
public class  main{
   static  ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
    public static void main(String[] args) {
        Coche v1 = new Coche("Azul", 10, "isma", "seat", 900);
        Vehiculo v2 = new Vehiculo("2pac", "50cent", 90);
        Vehiculo v3 = new Vehiculo("quique", "pau", 10);
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        Vehiculo.mostrarV(lista);
    }
    

}
