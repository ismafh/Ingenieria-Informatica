//import javax.swing.JOptionPane;
import java.util.Scanner;
public class EjerciciosT2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        /*Ejercicio 1

        int resultado;
        JOptionPane.showMessageDialog(null,"Piensa un numero");
        JOptionPane.showMessageDialog(null,"Multiplicalo por 5");
        JOptionPane.showMessageDialog(null,"Sumale 6");
        JOptionPane.showMessageDialog(null,"Multiplicalo por 4");
        JOptionPane.showMessageDialog(null,"Sumale 9");
        JOptionPane.showMessageDialog(null,"Multiplicalo por 5");
        
        resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero" ));

        JOptionPane.showMessageDialog(null, "Tu numero era :" + ((resultado - 165) / 100));

        */

        /*Ejercicio 2
        
        Scanner teclado = new Scanner(System.in);
        int numero1,numero2,auxiliar;
        System.out.println("Introduce el primer numero");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        numero2 = teclado.nextInt();
        auxiliar= numero1;
        numero1=numero2;
        numero2=auxiliar;

        System.out.println("Los numeros intercambiados son: " + "Numero 1: "+ numero1 +" Numero 2: "+ numero2 );
    
        */

        /*Ejercicio 3

        int numero,dias,horas,minutos,segundos;

        System.out.println("Introduce un numero de segundos inferior a un millon");
        numero = teclado.nextInt();
        dias = numero/86400;
        horas = (numero-dias*86400)/3600;
        minutos = (numero-dias*86400-horas*3600)/60;
        segundos = numero - dias*86400 - horas*3600 - minutos*60;

        System.out.println("En "+ numero +" segundos, hay :"+dias+" dias, "+horas+" horas, "+minutos+" minutos, y "+segundos+" segundos.");

        */

        /*Ejercicio 4
        String nombre;
        System.out.println("Como te llamas?");
        nombre = teclado.nextLine();

        System.out.println("Hola "+nombre);

        */




        /*Ejercicio 5
        String nombre,apellidos,direccion,telefono;
        System.out.println("Introduce tu nombre,apellido,direccion y telefono, en ese orden.");
        nombre=teclado.nextLine();
        apellidos=teclado.nextLine();
        direccion=teclado.nextLine();
        telefono=teclado.nextLine();

        System.out.println("***Ficha***" + "\n"+ apellidos + ", "+nombre+"\n"+"Direccion: " + direccion + "\n"+"Telefono: "+telefono); 


        */
        
        
        
        
        
        
        
        
        
        

        teclado.close();
    }
}
