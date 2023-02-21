package ejemplosClase;

import java.util.Scanner;

public class PedirUnDato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu edad: ");//Pedir dato de entrada
		
		//Leer un numero entero y cerrar teclado
		
		int edad = teclado.nextInt();
		teclado.close();
				
		//Imprimir la edad
		
		System.out.println("Su edad es " + edad + " años");
		
		
		
	}

}
