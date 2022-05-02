;
public class Coche {
    private String marca;
    private String color;
    private double km;

    public Coche(String m, String c, double kilometros){
        marca=m;
        color=c;
        km=kilometros;
    }

    public void leerDatos(){
        System.out.println("La marca es " + marca);
        System.out.println("El color es " + color);
        System.out.println("Los kilometros son " +km);
    }
    


}

