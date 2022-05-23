import java.io.*;
class Bixest2 {
  public static void main(String args[]) throws IOException{
    int any;
    boolean bixest;
    String teclejat;

    BufferedReader teclat= new 
    BufferedReader(new InputStreamReader(System.in));

    System.out.print("Tecleja l'any a analitzar: ");
    teclejat= teclat.readLine();
    any= Integer.parseInt(teclejat);

    bixest= (any%4 == 0) && (any%100 != 0) || (any%400 == 0);
    if (bixest) {
      System.out.println("L'any "+any+" és bixest");
    } else {
      System.out.println("L'any "+any+" no és bixest");
    }
  }
}
