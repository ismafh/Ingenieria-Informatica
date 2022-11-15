
/**
 * interface Conjunto 
 * 
 * @author LTP 
 * @version 2021-22
 */

public interface Conjunto<T> extends Coleccion<T> {
    boolean pertenece(T e); 
    Conjunto<T> subconjunto(int n);  
}