import java.util.*;
public class Factorial {
  public static void main(String args[]){
    int num;
    long factorial= 1;
    Scanner sc= new Scanner(System.in);
    do {
      System.out.print("Introdueix un enter entre 1 i 20: ");
      num= sc.nextInt();
      if (num < 0 || num > 20) System.out.println("Fora de rang");
    } while (num < 0 || num > 20); 
    int aux= num;
    while (aux > 1) {
      factorial*= aux;
      aux--;
    }
    System.out.printf("%d! = %d\n", num,factorial);
  }
}
