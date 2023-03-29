
/**
 * class ColeccionUse
 * 
 * @author LTP
 * @version 2021-22
 */

public class ColeccionUse {
    public static void main(String[] args) {
        Coleccion<Integer> vL = new VectorList<Integer>(); 
        Coleccion<Double> cL = new ConjuntoList<Double>();    
        Coleccion<Figure> cF = new FiguresConjunto<Figure>(); 
        for (int i = 8; i > 0; i--) {
            vL.add(i); 
            cL.add(i + 12.0);
        }
        System.out.println("VectorList vL : " + vL.aCadena());
        System.out.println("ConjuntoList cL : " + cL.aCadena());
        double x = 99.0;
        cL.add(x); 
        cL.add(x);
        System.out.println("ConjuntoList cL : " + cL.aCadena());
        Conjunto<Double> cL1 = (Conjunto<Double>) cL;
        System.out.print("Pertenecen al ConjuntoList? : ");
        System.out.print("(17.0 : " + cL1.pertenece(17.0) + ") ");
        System.out.print("(" + x + " : " + cL1.pertenece(x) + ") ");
        System.out.println("(" + (x-1) + " : " + cL1.pertenece(x-1)+ ")");
        for (int i = 3; i < 6; i++) {
            System.out.println("Subconjunto " + i + " elementos : " + cL1.subconjunto(i).aCadena());
        } 
        cF.add(new Figure(4.0, 6.5));
        cF.add(new Figure(3.5, 8.2));
        System.out.println("FiguresConjunto cF : " +cF.aCadena());
        FiguresConjunto cF1 = (FiguresConjunto) cF;
   }
}