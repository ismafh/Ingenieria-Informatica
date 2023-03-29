
/**
 * class VectorOrdList
 * 
 * @author LTP 
 * @version 2021-22
 */

public class VectorOrdList<T extends Comparable> extends VectorList<T> implements VectorOrd<T> {     
    public T maximo() { return getPos(size() - 1); }
    public T minimo() { return getPos(0); }
    public void add(T e) {
        int i = 0;
        while (i < size() && getPos(i).compareTo(e) < 0) { i++; }
        addPos(i,e);
    }
}