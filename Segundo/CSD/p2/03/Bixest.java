public class Bixest {
  public static void main(String args[]){
    boolean bixest;
    int any= Integer.parseInt(args[0]);

    bixest= (any%4 == 0) && (any%100 != 0) || (any%400 == 0);
    if (bixest) System.out.println(any+" és bixest");
    else System.out.println(any +" no és bixest");
  }
}
