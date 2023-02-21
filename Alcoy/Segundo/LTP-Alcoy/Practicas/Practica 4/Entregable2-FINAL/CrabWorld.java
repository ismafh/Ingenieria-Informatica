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
        int contador=0;
        Crab w1 = new Crab();
        addObject(w1,280,280);
        ballena t1 =new ballena();
        addObject(t1,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        //addObject(t1,450,300);
        langosta yi = new langosta();
        //addObject(yi,279,279);
        addObject(yi,Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
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
        if(Greenfoot.getRandomNumber(100)>15){
        Worm l5 = new Worm();
        addObject(l5, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l5 = new wrom();
        addObject(l5, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l6 = new Worm();
        addObject(l6, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l6 = new wrom();
        addObject(l6, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l7 = new Worm();
        addObject(l7, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l7 = new wrom();
        addObject(l7, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l8 = new Worm();
        addObject(l8, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l8 = new wrom();
        addObject(l8, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l9
 = new Worm();
        addObject(l9, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l9 = new wrom();
        addObject(l9, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l10 = new Worm();
        addObject(l10, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l10 = new wrom();
        addObject(l10, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l11 = new Worm();
        addObject(l11, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l11 = new wrom();
        addObject(l11, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l12 = new Worm();
        addObject(l12, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l12 = new wrom();
        addObject(l12, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l13 = new Worm();
        addObject(l13, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l13 = new wrom();
        addObject(l13, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l14 = new Worm();
        addObject(l14, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l14 = new wrom();
        addObject(l14, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }
if(Greenfoot.getRandomNumber(100)>15){
        Worm l15 = new Worm();
        addObject(l15, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }else{
        wrom l15 = new wrom();
        addObject(l15, Greenfoot.getRandomNumber(500),Greenfoot.getRandomNumber(500));
        }

        
    }
}

