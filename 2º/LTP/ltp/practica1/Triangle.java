package practica1;


/**
 * class Triangle.
 * 
 * @author LTP
 * @version 2020-21
 */

public abstract class Triangle extends Figure {
    private double base; 
    private double height;

    public Triangle(double x, double y, double b, double h) {
        super(x, y);
        base = b;
        height = h;
    }

    public String toString() {
        return "Triangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    
    public boolean equals(Object o){
        Triangle c = (Triangle) o;
        return super.equals(c) && base==c.base && height==c.height;
    }
}