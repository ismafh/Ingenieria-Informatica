import java.util.Stack;

public class pruerba {
    public static void main(String[] args) {
       Stack b = new Stack();
       int a = 3;
       int x =5;
       b.push(a);
       b.push(x);
       pertenece(3, b);
       desapilar(b);
    }



    public static void desapilar(Stack b){
        System.out.println("El valor desapilado es: " + b.pop());
    }

    public static boolean pertenece(int e, Stack b){
       return b.contains(e);
    }
}
