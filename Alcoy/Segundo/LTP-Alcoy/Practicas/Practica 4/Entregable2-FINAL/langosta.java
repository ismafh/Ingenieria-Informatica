import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class langosta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class langosta extends Actor
{
    static int gusanoscomidoslang;
    static int langostaalive=1;
    
    /**
     * Act - do whatever the langosta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText(null, getX(), getY());
        Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class);
        wrom wrom = (wrom)getOneObjectAtOffset(0, 0, wrom.class);
        move(4);
        
         if (Greenfoot.getRandomNumber(100) < 10)
         turn(Greenfoot.getRandomNumber(90)-45);
         if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
         turn(180);
         if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
         turn(180);
         if (worm != null) {
         gusanoscomidoslang++;
         getWorld().removeObject(worm);
         Greenfoot.playSound("eating.wav");
         }
         if (wrom != null) {
         gusanoscomidoslang++;
         getWorld().removeObject(wrom);
         Greenfoot.playSound("eating.wav");
         int extra=Greenfoot.getRandomNumber(100)+100;
         getWorld().showText(null,280,280);
         }
         getWorld().showText("" + gusanoscomidoslang, getX(), getY());
         getWorld().showText("Langosta: "+gusanoscomidoslang,480,20);
    }
}