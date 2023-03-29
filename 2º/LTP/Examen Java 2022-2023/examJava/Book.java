
public class Book extends Article {
    private String title;
 
    public Book(String n, double p, int cat, String t) {
        super(n, 0.04);
        setPriceCost(p);
        setCategory(1);
        title = t;
    }

    public String getTitle() { return title; } 
    
    public double getpriceBT(){
        return p*1.10;
    }
    
    public int compareTo(Article a){
        if(this.category.equals(a.cat) && this.title.equals(a.title)){
            return 0;
        }
    }
}