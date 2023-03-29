
public class Stationer extends Article {
    private String name;
    
    public Stationer(String n, double p, int cat, String nm) {
        super(n, 0.21);
        setPriceCost(p);
        setCategory(2);
        name = nm;
    }

    public String getName() { return name; }    
    
    public double getpriceBT(Article a){
        return p*1.15;
    }
    
    public int compareTo(Article a){
        if(this.cat.equals(cat) && this.name.equals(name)){
            return 0;
        }
    }
}