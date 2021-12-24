import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        populate();
    }
    public void populate()
    {
        Crab w1 = new Crab();
        addObject(w1,280,280);
        if(Greenfoot.getRandomNumber(100)>15){
        Worm w2 = new Worm();
        addObject(w2, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom w2 = new wrom();
        addObject(w2, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(100)>15){
        Worm l1 = new Worm();
        addObject(l1, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l1 = new wrom();
        addObject(l1, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(100)>15){
        Worm l2 = new Worm();
        addObject(l2, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        Worm l2 = new Worm();
        addObject(l2, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(100)>15){
        Worm l3 = new Worm();
        addObject(l3, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l3 = new wrom();
        addObject(l3, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
        if(Greenfoot.getRandomNumber(100)>15){
        Worm l4 = new Worm();
        addObject(l4, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l4 = new wrom();
        addObject(l4, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
    }
}
