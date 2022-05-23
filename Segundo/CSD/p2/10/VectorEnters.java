import java.util.*;
public class VectorEnters {
  public static void main(String args[]){
    int vector[];
    String text;
    Scanner sc= new Scanner(System.in);
    System.out.print("Introdueix el nombre d'elements: ");
    int nElem=sc.nextInt();
    vector= new int[nElem];
    System.out.println("Introdueix "+ nElem + " nombres enters");
    for (int i= 0; i < vector.length; i++) {
      System.out.print("Element " + (i+1) + ": ");
      vector[i]= sc.nextInt();
    }
    int major= vector[0];
    int menor= vector[0];
    int suma= 0;
    for(int v: vector){
      if (major < v) major= v;
      if (menor > v) menor= v;
      suma+= v;
    }
    System.out.println("Element major = " +major);
    System.out.println("Element menor = " +menor);
    System.out.println("Suma de tots  = " +suma);
  }
}
