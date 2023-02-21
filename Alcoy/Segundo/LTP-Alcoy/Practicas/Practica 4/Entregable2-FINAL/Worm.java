import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Worm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Worm extends Actor 
{
    public void act()
    {
    move(2);
     if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
     turn(180);
    }
}