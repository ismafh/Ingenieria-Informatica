// CSD feb 2015 Juansa Sendra

public class Pool4 extends Pool{ //kids cannot enter if there are instructors waiting to exit
    //Atributes to know how much swimmers of both types are swimming
    private int kids=0;
    private int inst=0;
    private int winst=0;
    private int ki;
    private int cap;
    public void init(int ki, int cap){this.ki=ki;this.cap=cap;}
    public synchronized void kidSwims()throws InterruptedException{
        while(kids+1>ki*inst || kids+inst+1>cap || winst>0){
            log.waitingToSwim();
            wait();
        }
        kids++;
        log.swimming();
    }
    public synchronized void kidRests(){
        kids--;
        log.resting();
        notifyAll(); 
    }
    public synchronized void instructorSwims()throws InterruptedException{
        while(kids+inst+1>cap){
            log.waitingToSwim();
            wait();
        }
        inst++;
        log.swimming();
        notifyAll();
    }
    public synchronized void instructorRests()throws InterruptedException{
        while(kids>inst-1){
            log.waitingToRest();
            winst++;
            wait();
            winst--;
            
        }inst--;
        log.resting();
    }
}
