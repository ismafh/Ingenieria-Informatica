
/**
 * class ConjuntoList
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ConjuntoList<T> extends VectorList<T> implements Conjunto<T> {     
    public boolean pertenece(T e) { 
        for (int i = 0; i < size(); i++) {
            if (getPos(i).equals(e)) return true;
        }
        return false;
    }

    public Conjunto<T> subconjunto(int n) { 
        Conjunto<T> res = new ConjuntoList<T>();
        for (int i = 0; i < n; i++) {
            res.add(getPos(i));
        }
        return res; 
    }
    
    public void add(T e) {
        if (!pertenece(e)) super.add(e);
    }
}