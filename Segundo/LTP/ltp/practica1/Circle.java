package practica1;


/**
 * class Circle.
 * 
 * @author LTP 
 * @version 2020-21
 */

public abstract class Circle extends Figure {
    private double radius;

    public Circle(double x, double y, double r) {
        super(x, y);
        radius = r;
    }

    public String toString() {
        return "Circle:\n\t" +
            super.toString() +
            "\n\tRadius: " + radius;
    }
    
    public boolean equals(Object o){
        Circle c = (Circle) o;
        return super.equals(c) && radius == c.radius;
    }
    
    public double area(Object o){
        Circle c = (Circle) o;
        double area = Math.PI*radius*radius;
        return area;
        }
        
     public double perimeter(){
        return 2 * Math.PI * radius;
    }
}