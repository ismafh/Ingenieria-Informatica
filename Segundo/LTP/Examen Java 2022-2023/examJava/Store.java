import java.util.*;

public class Store {
    private ArrayList<Article> store;
    private double cash;

    public Store() {
        store = new ArrayList<Article>();
        cash = 100.0;
    }
    
    public double getCash() { return cash; }

    public void updateCash(double d) { cash = cash - d; }
    
    public void addArticle(Article a) {        
        store.add(a);
        updateCash(a.getPriceCost());
    }
    
    public boolean sellArticle(Article a) {
        updateCash(0 - a.getPriceAT());
        return store.remove(a);
    }    
    
    public int getEqualsSample(Article a){
        int contador=0;
        for(int i=0;i<store.size();i++){
            if(store.get(i).equals(a)){
                contador++;
            }
        }
        return contador;
    }
}