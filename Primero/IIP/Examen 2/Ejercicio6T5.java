import java.util.Scanner;

public class Ejercicio6T5 {
    public void aTriangulo(float base, float altura){ //Metodo area triangulo
        float area;
        area = (base*altura)/2;
        System.out.print("El area del Triangulo es: "+area);
    }

    public void aCuadrado(float lado){ // Metodo area cuadrado
        float area;
        area = lado*lado;
        System.out.println("\nEl area del Cuadrado es: "+area);
    }
    public void aRombo(float dgrande, float dpequeña){ // Metodo area rombo
        float area;
        area=(dgrande*dpequeña)/2;
        System.out.println("El area del Rombo es: "+area);
    }
    public static void main(String[] args) {
        Ejercicio6T5 formulas = new Ejercicio6T5();
        Scanner tec = new Scanner(System.in);
        float btriangulo,atriangulo,lado,dgrande,dpequeña;
        System.out.println("Introduce la base del triangulo: ");
        btriangulo=tec.nextFloat();
        System.out.println("Introduce la altura del triangulo: ");
        atriangulo=tec.nextFloat();
        System.out.println("Introduce el lado del cuadrado: ");
        lado=tec.nextFloat();
        System.out.println("Introduce la Diagonal grande del rombo: ");
        dgrande=tec.nextFloat();
        System.out.println("Introduce la Diagonal pequeña del rombo: ");
        dpequeña=tec.nextFloat();
        tec.close();

        formulas.aTriangulo(btriangulo, atriangulo);
        formulas.aCuadrado(lado);
        formulas.aRombo(dgrande, dpequeña);


        
    }
}
