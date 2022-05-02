import javax.swing.JOptionPane;



public class EjemploSwitch {
    public static void main(String[] args) throws Exception {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entre el 1 y el 3"));
        switch(numero){
            case 1: System.out.println("El numero es el 1");
            break;
            case 2: System.out.println("El numero es el 2");
            break;
            case 3: System.out.println("El numero es el 3");
            break;
            default: System.out.println("El numero no esta entre los numeros");
            break;
        }
    }
}
