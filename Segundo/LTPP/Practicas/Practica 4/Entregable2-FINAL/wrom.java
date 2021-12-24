import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wrom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wrom extends Actor
{
    /**
     * Act - do whatever the wrom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    int moverse=2;
     move(moverse);
     if (getX() <= 5 || getX() >= getWorld().getWidth() - 5){
         if(Greenfoot.getRandomNumber(100)<24){
           turn(Greenfoot.getRandomNumber(90)-45);
         }else{
         turn(180);
         }
         turn (180);
    }
}
}
