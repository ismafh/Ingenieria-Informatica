import java.util.*;
public class ProducteEscalar {
  public static void main(String args[]) {
    int vector1[]= new int[3]; 
    int vector2[]= new int[3]; 
    boolean zero= false;
    int res= 0;
    Scanner sc= new Scanner(System.in);
    for (int i= 0; i < vector1.length; i++) {
      System.out.print("Vector1["+i+"]: ");
      vector1[i]= sc.nextInt();
    }
    for (int i= 0; i < vector2.length; i++) {
      System.out.print("Vector2["+i+"]: ");
      vector2[i]= sc.nextInt();
    }
    for (int i= 0; i < vector1.length; i++) {
      res+= vector1[i]*vector2[i];
      zero= (vector1[i] == 0) || (vector2[i] == 0);
      if (zero) break; 
    }
    if (!zero) System.out.printf("El producte escalar és: %d\n",res);
    else System.out.println("Algun component és nul");
  }
}
