



public class Examen2 {
    public static void imprimir(String e){
        
            if (e.length() == 1){
            System.out.println(e.substring(0));
           }else{
             System.out.println(e.substring(e.length()-1));
            
            imprimir(e.substring(0,e.length()-1));
        } 
    }




    public static void main(String[] args) {
        String joel="a";

        Examen2.imprimir(joel);
    }
}



/*public String reverse(String palabra) {
    if (palabra.length() == 1)
      return palabra;
    else 
      return reverse(palabra.substring(1)) + charAt(0);
   }
   */