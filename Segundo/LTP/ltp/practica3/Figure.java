package practica3;


/**
 * class Figure.
 * 
 * @author LTP 
 * @version 2020-21
 */

public abstract class Figure {
    private double x;
    private double y;
    
    public Figure(double x, double y) {
        this.x = x; 
        this.y = y; 
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Figure)) { return false; }
        Figure f = (Figure) o;
        return x == f.x && y == f.y;
    }
    
    public String toString() {
        return "Position: (" + x + ", " + y + ")"; 
    }
    
        public int compareTo(Object f2){
        int res = 0;
        
        if (this.area() < ((Figure) f2).area()){
            res = -1;
        }
        else {
            res = 1;
        }
        
        return res;
    }
    
    abstract double area(); 
    
    abstract double perimeter();
}