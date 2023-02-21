import java.util.Scanner;

public class LlenarArray {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int nelementos;
        System.out.println("Introduce el numero de elementos que quieres en el array");
        nelementos=tec.nextInt();
        
        int[] numeros = new int[nelementos];

        System.out.println("Introduce los elementos del array");
        for(int i=0;i<nelementos;i++){
            System.out.println((i+1)+ ".Introduce un numero: ");
            numeros[i]= tec.nextInt();
        }

        System.out.println("\nLos elementos del array son: ");
        for(int i:numeros){
            System.out.println(i);
        }
        tec.close();
    }
}
