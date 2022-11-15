
/**
 * class ColeccionUse
 * 
 * @author LTP
 * @version 2021-22
 */

public class ColeccionUse {
    public static void main(String[] args) {
        Coleccion<Integer> vL = new VectorList<Integer>(); 
        Coleccion<Double> cL = new ColaList<Double>();    
        Coleccion<Figure> cF = new FiguresCola<Figure>(); 
        for (int i = 8; i > 0; i--) {
            vL.add(i); 
            cL.add(i + 12.0);
        }
        int x = 99;
        double y = (double) x;
        System.out.print("Cuantos en el Vector? ");
        System.out.print("(8 : " + vL.apariciones(8) + ") "); 
        System.out.println("(" + x + " : " + vL.apariciones(x) + ")"); 
        cL.remove(); 
        cL.remove();
        cL.add(y); 
        cL.add(y);
        System.out.println("ColaList cL : " + cL.aCadena());
        Cola<Double> cL1 = (Cola<Double>) cL;
        System.out.println("primero : " + cL1.primero());
        System.out.println("desencolar : " + cL1.desencolar());
        System.out.println("primero : " + cL1.primero());
        System.out.println("ColaList pL : " + cL.aCadena());
        System.out.print("Cuantos en la Cola? ");
        System.out.print("(8.0 : " + cL.apariciones(8.0) + ") "); 
        System.out.println("(" + y + " : " + cL.apariciones(y) + ")"); 
        cF.add(new Figure(4.0, 6.5));
        cF.add(new Figure(3.5, 8.2));
        System.out.println("FiguresCola cF : " +cF.aCadena());
        FiguresCola cF1 = (FiguresCola) cF;
        System.out.println("y del primero de cF: " + cF1.getYprimero());
   }
}
