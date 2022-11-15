
/**
 * class ColaList
 * 
 * @author LTP 
 * @version 2021-22
 */

public class ColaList<T> extends VectorList<T> implements Cola<T> {     
    public T primero() { return getPos(0); }
    public T desencolar() { return removePos(0); }
}