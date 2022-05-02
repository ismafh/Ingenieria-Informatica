import java.util.Scanner;



public class Ejercicio5T5 {

    public float paga(float _hora,float _importe) {
        float total=0;
        if(_hora > 40){
            total= (_hora*_importe)+ (_importe*(_hora-40)*50/100);
        }else{
            total=_hora*_importe;
        }
        return total;
        
    }
   
    public static void main(String[] args) {
    
        Ejercicio5T5 paga = new Ejercicio5T5();
        float horas,importe,total;
    Scanner tec = new Scanner(System.in);
    System.out.println("Introduce el numero de horas: ");
    horas = tec.nextFloat();
    System.out.println("Introduce el dinero por hora: ");
    importe=tec.nextFloat();
    tec.close();

    total= paga.paga(horas, importe);
    System.out.print("La paga total es : "+total);

    
    
    

        
    }
}
