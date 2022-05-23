import java.util.*;
public class Email {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    String email;
    do {
      System.out.print("Adreça de correu? ");
      email= sc.nextLine();
      if (email.indexOf("@") < 1 || email.length() < 5) {
        System.out.println("Adreça de correu no vàlida");
      }
    } while(email.indexOf("@") < 1 || email.length() < 5);
    System.out.print("La teva adreça de correu electrònic ");
    System.out.println("ha estat admesa");
  }
}
