
/**
 * class FiguresPila
 * 
 * @author LTP 
 * @version 2021-22
 */

public class FiguresPila<T extends Figure> extends PilaList<T> {
    public double getXcima() { return cima().x; }
}