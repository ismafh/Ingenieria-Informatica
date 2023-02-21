import java.util.*;
public class SumaMatricial {
  public static void main( String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("--- Suma de matrius ---");
    System.out.print("Nombre de files de les matrius: ");
    int nF= sc.nextInt();
    System.out.print("Nombre de columnes de les matrius: ");
    int nC= sc.nextInt();
    int m1[][]= new int[nF][nC];
    int m2[][]= new int[nC][nC];
    System.out.println("Elements de la matriu 1");
    for (int i= 0; i < nF; i++) {
      for (int j= 0; j < nC; j++) {
        System.out.print("Element: " + i +" "+ j+"= ");
        m1[i][j]= sc.nextInt();
      }
    }
    System.out.println("Elements de la matriu 2");
    for (int i= 0; i < nF; i++) {
      for (int j= 0; j < nC; j++) {
        System.out.print("Element: " + i +" "+ j+"= ");
        m2[i][j]= sc.nextInt();
      }
    }
    System.out.println("La matriu suma és:");
    for (int i= 0; i < nF; i++) {
      for (int j= 0; j < nC; j++) {
        System.out.print(m1[i][j]+m2[i][j]+" ");
      }
      System.out.println("");
    }
  }
}
