import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Crab extends Actor
{
    int totalgusanos=15;
    int time=500;
    int gusanoscomidos=0;
    int gusanoscomidoslang=langosta.gusanoscomidoslang;
    int langostaalive=0;
    
    /**
     * Act - do whatever the Crab wants to do. Th is method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        time--;
        gusanoscomidoslang=0;
        langosta langosta = (langosta)getOneObjectAtOffset(0, 0, langosta.class);
        ballena ballena =(ballena)getOneObjectAtOffset(0, 0, ballena.class);
        if (time<0||totalgusanos==0){
            ganador();
            langosta.gusanoscomidoslang=0;
            Greenfoot.stop();
         }else{
         getWorld().showText(null ,getX(),getY());
         move(3);// Limpiamos el texto
         if (Greenfoot.isKeyDown("left")) turn(-3);
         if (Greenfoot.isKeyDown("right")) turn(3);
         Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class);
         wrom wrom = (wrom)getOneObjectAtOffset(0, 0, wrom.class);
         Crab crab = (Crab)getOneObjectAtOffset(0, 0, Crab.class);
         if (worm != null) {
         totalgusanos--;
         gusanoscomidos++;
         getWorld().removeObject(worm);
         Greenfoot.playSound("eating.wav");
         }
         if (wrom != null) {
         totalgusanos--;
         gusanoscomidos++;
         getWorld().removeObject(wrom);
         Greenfoot.playSound("eating.wav");
         int extra=Greenfoot.getRandomNumber(100)+100;
         time=time+extra;
         }
         if (langosta!=null){
           getWorld().showText("Ha ganado la langosta", 280,280);
           Greenfoot.playSound("langosta.wav");
           getWorld().showText(null,getX(),getY());
           langosta.gusanoscomidoslang=0;
           langosta.langostaalive=1;
           Greenfoot.stop();
         }
         if (ballena!= null) {
         getWorld().removeObject(crab);
         Greenfoot.playSound("eating.wav");
         getWorld().showText("Ha ganado la ballena", 280,280);
         getWorld().showText(null, getX(), getY());
         Greenfoot.stop();
         }
         getWorld().showText("" + gusanoscomidos, getX(), getY());
         getWorld().showText("Tiempo: " + time/100+"."+time%100+"s",280,20);
         getWorld().showText("Cangrejo: "+gusanoscomidos,80,20); 
        }
}
        public void ganador(){
        if (time<0){
            if (gusanoscomidoslang>gusanoscomidos && langostaalive== 1){
                getWorld().showText(""+gusanoscomidoslang,100,100);
                getWorld().showText("Time is over", 260,260);
                getWorld().showText("Ha ganado la langosta", 275,320);
            }else if(gusanoscomidos>=gusanoscomidoslang){
                getWorld().showText("Time is over", 260,260);
                getWorld().showText("Ha ganado el cangrejo", 275,320);
            }else{
                getWorld().showText("Time is over", 260,260);
                getWorld().showText("Ha habido un empate", 275,320);
            }
        }
    }
    }
    



