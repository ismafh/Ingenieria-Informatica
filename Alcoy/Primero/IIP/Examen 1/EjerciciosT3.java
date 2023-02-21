import java.util.Scanner;

public class EjerciciosT3 {
    public static void main(String[] args) {
       Scanner tec = new Scanner(System.in);
       
        /*Ejercicio 12

        int v1,v2,v3;
        System.out.println("Introduce el primer valor");
        v1=tec.nextInt();
        System.out.println("Introduce el segundo valor");
        v2=tec.nextInt();
        System.out.println("Introduce el tercer valor");
        v3=tec.nextInt();

        if(v1>v2 && v1>v3){
            if(v2>v3){
                System.out.println(v1 +", "+v2+", "+v3);
            }else{
                System.out.println(v1 +", "+v3+", "+v2);
            }
        }else if(v2>v1 && v2>v3){
            if(v1>v3){
                System.out.println(v2+ ", "+v1+", "+v3);
            }else{
                System.out.println(v2 +", "+v3+", "+v1);
            }
        }else if(v3>v2 && v3>v1){
            if(v2>v1){
                System.out.println(v3+ ", "+v2+", "+v1);
            }else{
                System.out.println(v2 +", "+v1+", "+v2);
            }
        }
        */

        
        /*Ejercicio 16
        int anio;
        System.out.println("Introduce el año");
        anio = tec.nextInt();
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
            System.out.println("El año es bisiesto");
        }
	    
        else{
            System.out.println("El año no es bisiesto");
        }
        */
        
        /*Ejercicio 29
        double num1,num2,operacion;
        String operador;
        
        System.out.println("Introduce el primer valor");
        num1=tec.nextInt();
        System.out.println("Introduce el segundo valor");
        num2=tec.nextInt();
        System.out.println("Introduce el operador");
        operador=tec.next();
        
        
        switch(operador){
            case "+": operacion=num1+num2;
                System.out.println("La suma es: "+operacion);
                break;

            case "-": operacion=num1-num2;
                System.out.println("La resta es: "+operacion);
                break;
             
            case "*": operacion=num1*num2;
                System.out.println("La multiplicacion es: "+operacion);   
                break;
            case "/": operacion=num1/num2;
                System.out.println("La division es: "+operacion);
                break;

            default: System.out.println("Operacion no permitida");
                break;    

        }
        */

        /*Ejercicio 21
        float hora;
        System.out.println("Escribe la hora en formato 24 horas hh,mm");
        hora=tec.nextFloat();
        if(hora>24){
            System.out.println("La hora introducida no es correcta");
        }else if(hora<12.00){
            System.out.println("La hora es: "+hora+" AM");
        }else {
            System.out.println("La hora es: "+(hora-12)+" PM");
        }
        */

        //Ejercicio 25

        String carnet;
        int practicas;

        System.out.println("Introduzca el carnet deseado(A,B,C,D)");
        carnet=tec.nextLine();
        System.out.println("Introduzca el numero de practicas");
        practicas=tec.nextInt();
        switch(carnet){
            case "a":
            case "A": System.out.println("La matricula son 150€ y las practicas "+(practicas*15)+"€");
                break;
            case "b":
            case "B": System.out.println("La matricula son 325€ y las practicas "+(practicas*21)+"€");
                break;
            case "c":
            case "C": System.out.println("La matricula son 520€ y las practicas "+(practicas*36)+"€");    
                break;
            case "d":
            case "D": System.out.println("La matricula son 610€ y las practicas "+(practicas*50)+"€"); 
                break;
            default: System.out.println("Ese carnet no esta disponible");           
        }
        
        





        tec.close();
        
    }
}
