import java.util.Scanner;
public class Calculadora{
    public static void main(String[] args) throws Exception {
        Calculadora.inicio();
    }
    public static void inicio(){

        
        Scanner teclado = new Scanner(System.in);

        String formula;
        Double n1=0.0, n2=0.0;
        System.out.println("Calculadora programada por Ismael Fernandez, Trabajo IIP");
        System.out.println(">> Introduce la operacion desdeada:");

        formula = teclado.nextLine().trim();
        teclado.close();
        formula = formula.replace(" ","");
        formula = formula.replace("(", "");
        formula = formula.replace(")", "");
        formula = formula.replace("--", "+");
        formula = formula.replace("+-", "-");
        formula = formula.replace("-+", "-");
        formula = formula.replace("++", "+");

        if(formula.contains("*")){
            try{

            n1 = Double.parseDouble(formula.substring(0,formula.indexOf('*'))); 
            n2 = Double.parseDouble(formula.substring(formula.indexOf('*') + 1, formula.length()));
            
        }catch (Exception e){
            System.out.println("No es posible");
        }
    
            System.out.println(n1 * n2);

        } else if(formula.contains("/")){
            try{
            n1 = Double.parseDouble(formula.substring(0,formula.indexOf('/'))); 
            n2 = Double.parseDouble(formula.substring(formula.indexOf('/') + 1, formula.length()));
        }catch (Exception e){
                System.out.println("No es posible");
            }
            if(n2 == 0){
                System.out.println("No se puede dividr entre 0.");
            }else{
                System.out.println(n1 / n2);
            }
        }

         else if((formula.indexOf("-", 1) > 0)){
            try{
            n1 = Double.parseDouble(formula.substring(0,formula.lastIndexOf('-')));
            n2 = Double.parseDouble(formula.substring(formula.lastIndexOf('-'), formula.length()));
            System.out.println(n1 + n2);
        }catch(Exception e){
            System.out.println("No es posible");
        }

        } else if((formula.indexOf("+", 1) > 0)) {
            try{
            n1 = Double.parseDouble(formula.substring(0,formula.lastIndexOf('+')));
            n2 = Double.parseDouble(formula.substring(formula.lastIndexOf('+'), formula.length()));
            System.out.println(n1 + n2);
        }catch(Exception e){
            System.out.println("No es posible");
        }
        }
    }
}
