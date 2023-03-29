
/**
 * interface Cola 
 * 
 * @author LTP 
 * @version 2021-22
 */

public interface Cola<T> extends Coleccion<T> {
    T primero(); 
    T desencolar();  
}