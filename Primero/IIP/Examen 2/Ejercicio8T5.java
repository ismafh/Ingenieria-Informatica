import java.util.Scanner;

public class Ejercicio8T5 {
    
    public void descuentos(float compra){
        if(compra < 500){
            System.out.println("La compra es menor a 500 euros y por lo tanto no hay descuento. El total a pagar es >"+compra);
        }else if(compra>=500 && compra<=2000){
            compra=compra-(compra*20/100);
            System.out.println("Se aplica un descuento del 30% y por lo tanto tiene que pagar: "+compra);

        }else{
            compra=compra-(compra*50/100);
            System.out.println("Se aplica un descuento del 50% y por lo tanto tiene que pagar: "+compra);
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        Ejercicio8T5 compra = new Ejercicio8T5();
        Scanner tec = new Scanner(System.in);

        float dinero;
        System.out.print("Introduce el valor de la compra: ");
        dinero=tec.nextFloat();
        tec.close();

        compra.descuentos(dinero);
        
        
    }
}
