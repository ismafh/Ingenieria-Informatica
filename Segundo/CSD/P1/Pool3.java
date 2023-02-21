// CSD feb 2015 Juansa Sendra

public class Pool3 extends Pool{ //max capacity
    private int kids=0;
    private int inst=0;
    private int ki;
    private int cap;
    public void init(int ki, int cap){this.ki=ki;this.cap=cap;}
    public synchronized void kidSwims()throws InterruptedException{
        while(kids+1>ki*inst ||kids+inst+1>cap ){
            log.waitingToSwim();
            wait();
        }/*if(kids+inst+1>cap){
            log.waitingToSwim();
            wait();
        }*/kids++;
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
            wait();
        }inst--;
        log.resting();
    }
}
