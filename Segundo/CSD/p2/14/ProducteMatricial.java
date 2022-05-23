import java.util.*;
public class ProducteMatricial {
  public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("--- Multiplicació de matrius ---");
    System.out.print("Nombre de files de la 1: ");
    int nF= sc.nextInt();
    System.out.print("Nombre de columnes de la 1: ");
    int nC= sc.nextInt(); 
    System.out.print("Nombre de columnes de la 2: ");
    int nC2= sc.nextInt();
    int m1[][]= new int[nF][nC];
    int m2[][]= new int[nC][nC2];
    int m3[][]= new int[nF][nC2];
    System.out.println("Elements de la matriu 1");
    for (int i= 0; i < m1.length; i++) {
      for (int j= 0; j < m1[0].length; j++) {
        System.out.print("Element: "+i+" "+j+"=");
        m1[i][j]= sc.nextInt();
      }
    }
    System.out.println("Elements de la matriu 2");
    for (int i= 0; i < m2.length; i++) {
      for (int j= 0; j < m2[0].length; j++) {
        System.out.print("Element: "+i+" "+j+"=");
        m2[i][j]= sc.nextInt();
      }
    }
    for (int i= 0; i < m1.length; i++) {
      for (int k= 0; k < m2[0].length; k++) {
        int t= 0;
        for(int j= 0; j < nC; j++) t+= m1[i][j]*m2[j][k];
        m3[i][k]= t;
      }
    }
    System.out.println("La matriu resultant del producte és:");
    for (int i= 0; i < m1.length; i++) {
      for (int j= 0; j < m2[0].length; j++) System.out.print(m3[i][j]+" ");
      System.out.println("");
    }
  }
}
