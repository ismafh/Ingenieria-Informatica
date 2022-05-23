import static java.lang.Math.*;
public class Formats {
  public static void main(String args[]){
    System.out.printf("%d %05.1f \n", 1,PI);
    System.out.printf("%d %,.3f \n", 2,PI*1000);
    System.out.printf("%d %12.6f \n",3,PI*1000);
    System.out.printf("%d %.15f \n",4,PI*1000);
    System.out.printf("%d %+.5f \n",5,PI);
    System.out.printf("%d %09.3g \n",6,PI*1000);
    System.out.printf("%o %,6g \n",70,PI*1000);
    System.out.printf("%o %(.1e \n",80,-PI*1000);
    System.out.printf("%h %.4e \n",90,-PI);
    System.out.printf("%h %+.7e \n",100,PI);
  }
}
