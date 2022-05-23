public class SegonArray {
  public static void main(String args[]){
    String noms[]= {"Madrid", "Barcelona", "València"};

    // Versió "a la antiga"
    for (int i=0; i<noms.length; i++) System.out.println(noms[i]);

    // Versió seguint l'estil de J2SE5 i amb bloc
    for (String nom:noms) {
      System.out.println(nom);
    }
  }
}
