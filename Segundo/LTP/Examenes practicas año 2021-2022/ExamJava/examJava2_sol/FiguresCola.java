
/**
 * class FiguresPila
 * 
 * @author LTP 
 * @version 2021-22
 */

public class FiguresCola<T extends Figure> extends ColaList<T> {
     public double getYprimero() { return primero().y; }
}