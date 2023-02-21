import java.util.Scanner;

public class Ejercicio7T5 {
    
    
    public void coste(float area,float coste,float iva){ // Metodo para sacar el coste total de la casa, como no es necesario almacenar el valor, utilizo void.
        float total=(area*coste)+(area*coste*(iva/100));
        System.out.println("El total a pagar es: "+total);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Ejercicio7T5 casa = new Ejercicio7T5();
        Scanner tec = new Scanner(System.in);
        float area,coste,iva;

        System.out.println("Introduce el area de la casa:");
        area=tec.nextFloat();
        System.out.println("Introduce el coste por metro cuadrado: ");
        coste=tec.nextFloat();
        System.out.println("Introduce el iva: ");
        iva=tec.nextFloat();

        tec.close();

        casa.coste(area, coste, iva);
    }
}
