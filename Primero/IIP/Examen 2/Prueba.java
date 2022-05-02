import java.util.Scanner;
public class Prueba {
    public static void main(String[] args){                           //Ejemplo de con el metodo constructor
    Scanner tec = new Scanner(System.in);
    
    String marca; 
    System.out.println("Introduce la marca: ");
    marca= tec.nextLine();
    String color;
    System.out.println("Introduce el color: ");
    color= tec.nextLine();

    double km;
    System.out.println("Introduce el numero de km: ");
    km=tec.nextDouble();

    tec.close();

    Coche op = new Coche(marca,color,km);

    op.leerDatos();
    
    }
    



}

    
