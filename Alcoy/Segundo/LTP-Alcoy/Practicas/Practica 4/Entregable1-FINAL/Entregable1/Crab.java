import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Crab extends Actor
{
    int totalgusanos=0;
    int time=500;
    int gusanoscomidos=0;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        time--;
        getWorld().showText(null, getX(), getY());
            move(3);// Limpiamos el texto
         if (Greenfoot.isKeyDown("left")) turn(-3);
         if (Greenfoot.isKeyDown("right")) turn(3);
         Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class);
         wrom wrom = (wrom)getOneObjectAtOffset(0, 0, wrom.class);
         if(time<=0){
            getWorld().showText("Has perdido", 280,280);
            Greenfoot.stop();
          }
          if(gusanoscomidos ==5){
              getWorld().showText("Has ganado", 280,280);
              Greenfoot.stop();
          }
         if (worm != null) {
         totalgusanos++;
         gusanoscomidos++;
         getWorld().removeObject(worm);
         Greenfoot.playSound("eating.wav");
         }
         if (wrom != null) {
         totalgusanos++;
         gusanoscomidos++;
         getWorld().removeObject(wrom);
         Greenfoot.playSound("eating.wav");
         int extra=Greenfoot.getRandomNumber(100)+100;
         time=time+extra;
         getWorld().showText(null,280,280);
         }
     getWorld().showText("" + totalgusanos, getX(), getY());
     getWorld().showText("Tiempo: " + time/100+"."+time%100+"s",280,20);
        
}
    }    



