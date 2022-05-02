import java.util.Scanner;

public class SumaNnumeros {
    public static void main(String[] args){
        Scanner tec = new Scanner(System.in);

        int numero,suma=0; 
        System.out.println("Introduce un numero >>");
        numero=tec.nextInt();
        tec.close();
        for(int i=0;i<numero;i++){
            suma = (numero*(numero+1)/2)-numero;         
        }
        System.out.println("El resultado de la suma de N numeros es: "+suma);

        
       

        
            
            
        
    }
}
