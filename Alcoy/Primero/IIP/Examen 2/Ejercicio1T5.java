
import java.util.Scanner;

public class Ejercicio1T5 {
    
    
    public void maximo(float a, float b, float c){ // Metodo para saber cual de los 3 numeros es mayor
        if (a>b && a>c){
            System.out.println("El mayor es : "+a);
        }else if(b>a && b>c){
            System.out.println("El mayor es: "+b);
        }else{
            System.out.println("El mayor es : "+c);
        }
    }
    public static void main(String[] args) {
        
        float a,b,c;
        Ejercicio1T5 metodo = new Ejercicio1T5();
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce el primer numero >>");
        a = tec.nextFloat();
        System.out.print("Introduce el segundo numero>>");
        b= tec.nextFloat();
        System.out.print("Introduce el tercer numero>>");
        c = tec.nextFloat();
        
        tec.close();
        metodo.maximo(a, b, c);



        


    }
}
