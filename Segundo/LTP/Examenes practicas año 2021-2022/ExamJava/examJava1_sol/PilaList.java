
/**
 * class PilaList
 * 
 * @author LTP 
 * @version 2021-22
 */

public class PilaList<T> extends VectorList<T> implements Pila<T> {     
    public T cima() { return getPos(size() - 1); }
    public T desapilar() { return removePos(size() - 1); }
    
}