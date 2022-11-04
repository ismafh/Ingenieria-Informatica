
/**
 * class Figure
 * 
 * @author LTP 
 * @version 2021-22
 */

public class Figure implements Comparable<Figure> {
    protected double x;
    protected double y;
    
    public Figure(double x, double y) {
        this.x = x; 
        this.y = y; 
    }
      
    public int compareTo(Figure f) {
        double dthis = x * x + y * y;
        double df = f.x * f.x + f.y * f.y;
        if (dthis < df) return -1;
        if (dthis > df) return 1;
        return 0;
    }
    
    public boolean equals(Object o) {
        if (!(o instanceof Figure)) { return false; }
        Figure f = (Figure) o;
        return x == f.x && y == f.y;
    }
    
    public String toString() {
        return "Position: (" + x + ", " + y + ")"; 
    }
}