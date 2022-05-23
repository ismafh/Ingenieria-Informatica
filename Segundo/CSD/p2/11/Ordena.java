import java.util.*;
public class Ordena {
  public static void main(String args[]){
    double nums[]= {32.0, 45.5, 12.2, 28.4, 76.3, 2.1, 53.0, 31.4, 29.5};
    System.out.println("Abans d'ordenar: "); 
    for (double num:nums) System.out.print(num+" "); 
    Arrays.sort(nums); 
    System.out.println("\nDesprés d'ordenar-los: "); 
    for (double num:nums) System.out.print(num+" "); 
    System.out.println("\n"); 
  }
}
