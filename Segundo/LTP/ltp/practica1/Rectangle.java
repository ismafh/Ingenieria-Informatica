package practica1;


/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Figure{
    private double height,base;
    
    public Rectangle(double x, double y, double b, double h){
        super(x,y);
        base = b;
        height = h;
    }
    
    public boolean equals(Object o){
        if(!(o instanceof Rectangle)){
            return false;
        }
        Rectangle c = (Rectangle) o;
        return super.equals(c) && base == c.base && height == c.height;
    }
    
    public String toString() {
        return "Rectangle:\n\t" +
            super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    
    public String toString(int i) {
        return super.toString() +
            "\n\tBase: " + base +
            "\n\tHeight: " + height;
    }
    
    public double area(){
        return base * height;
    }
    
    public double perimeter(){
        return base * 2 + height * 2;
    }
    
}
