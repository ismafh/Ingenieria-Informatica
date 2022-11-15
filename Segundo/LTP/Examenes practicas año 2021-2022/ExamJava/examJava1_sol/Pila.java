
/**
 * interface Pila 
 * 
 * @author LTP 
 * @version 2021-22
 */

public interface Pila<T> extends Coleccion<T> {
    T cima(); 
    T desapilar(); 
}