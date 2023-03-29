
/**
 * class ColeccionUse
 * 
 * @author LTP
 * @version 2021-22
 */

public class ColeccionUse {
    public static void main(String[] args) {
        Coleccion<Integer> vL = new VectorList<Integer>(); 
        Coleccion<Double> vOL = new VectorOrdList<Double>();    
        Coleccion<Figure> fO = new FigurasOrdenadas<Figure>(); 
        for (int i = 8; i > 0; i--) {
            vL.add(i);
            vOL.add(i + 12.0);
            fO.add(new Figure(i,i));
        }
        int x = 99;
        double y = (double) x;
        System.out.println("VectorList vL : " + vL.aCadena());
        vOL.remove();
        vOL.remove();
        vOL.add(y);
        System.out.println("VectorOrdList vOL : " + vOL.aCadena());
        VectorOrd<Double> vOL1 = (VectorOrd<Double>) vOL;
        System.out.println("máximo : " + vOL1.maximo());
        System.out.println("mínimo : " + vOL1.minimo());
        System.out.println("FiguresOrdenadas fO : " + fO.aCadena());
        FigurasOrdenadas fO1 = (FigurasOrdenadas) fO;
        System.out.println("x del elemento más alejado del eje de fO: " + fO1.getXmax());
   }
}
