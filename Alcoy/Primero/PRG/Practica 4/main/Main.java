package main;
import java.util.Scanner;
import dic.Word;
import dic.Dictionary;



public class Main {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcionPri = 0;
        Dictionary dic = new Dictionary();
        Word aux;
        int x;
        do {
            
                opcionPri = mainMenu(tec);

                switch (opcionPri) {
                    case 1:
                    
                      aux=newWord(tec);
                      dic.insert(aux);
                      
                        break;
                    case 2:
                    
                        aux=removeWord(tec);
                         x=dic.remove(aux);
                        if (x==0){
                            System.out.println("Se ha eliminado correctamente");
                        }else{
                            System.out.println("No existe");
                        }
                    
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                      dic.listWords();
                        
                        break;
                    case 5:
                      
                        break;
                   
                }
            
        } while (opcionPri != 5);

    }

    public static int mainMenu(Scanner tec) {
        int toret;

        do {
            System.out.println("\n\tInsert an option\n"
                    + "\n1. Insert a word "
                    + "\n2. Remove a word "
                    + "\n3. Find a word"
                    + "\n4. Print all words"
                    + "\n5. Exit\n");
                System.out.println("Option: ");
                toret = Integer.parseInt(tec.nextLine());
                if(toret<1 || toret>5){
                    System.out.println("Introduce un numero válido");
                }
        } while (toret < 1
                || toret > 5);

        System.out.println();
        return toret;
    }

    public static Word newWord(Scanner tec){
      Word a = new Word("","");
      System.out.println("Introduce la palabra en Español: ");
      String wordEsp=tec.nextLine();
      a.setSpanish(wordEsp);
      System.out.println("Introduce la palabra en Ingles: ");
      String wordEng=tec.nextLine();
      a.setEnglish(wordEng);
      return a;
    }

    public static Word removeWord(Scanner tec){
        Word a = new Word("","");
        System.out.println("Introduce la palabra a eliminar en Español: ");
        String wordEsp=tec.nextLine();
        a.setSpanish(wordEsp);
        
        return a;
    }

    

   

}