
public abstract class Article implements Comparable {
    private String id;
    private double priceCost;
    private double tax;
    private int category;    
    
    public Article(String s, double t) { id = s; tax = t; }
    
    public String getId() { return id; }
    public double getPriceCost() { return priceCost; }
    public double getTax() { return tax; }
    public int getCategory() { return category; }
    
    public void setCategory(int c) { category = c; }
    public void setPriceCost(double c) { priceCost = c; }    
    
    public abstract double getPriceBT();
    
    public int compareTo(Article a){
        if(this.category==a.category){
            return 0;
        }else if (this.category>a.category){
            return 1;
        }else{
            return -1;
        }
        
    }
    
    public double getPriceAT() {
        return this.getPriceBT() * (1 + tax);
    }
}