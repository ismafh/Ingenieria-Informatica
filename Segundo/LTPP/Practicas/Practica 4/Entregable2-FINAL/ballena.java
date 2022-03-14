import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ballena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ballena extends Actor
{
    static int gusanoscomidos=0;
    public void act()
    {
        Worm worm = (Worm)getOneObjectAtOffset(0, 0, Worm.class);
        wrom wrom = (wrom)getOneObjectAtOffset(0, 0, wrom.class);
        langosta langosta = (langosta)getOneObjectAtOffset(0, 0, langosta.class);
        Crab crab = (Crab)getOneObjectAtOffset(0, 0, Crab.class);
        move(2);
        
         if (Greenfoot.getRandomNumber(100) < 10)
         turn(Greenfoot.getRandomNumber(90)-45);
         if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
         turn(180);
         if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
         turn(180);
         if (worm != null) {
         getWorld().removeObject(worm);
         Greenfoot.playSound("eating.wav");
         redimensionar();
         gusanoscomidos++;
         }
         if (wrom != null) {
         getWorld().removeObject(wrom);
         Greenfoot.playSound("eating.wav");
         if (gusanoscomidos>5){
             redimensionar();
             gusanoscomidos++;
         }else{
         gusanoscomidos++;
         }
         if (langosta != null) {
         getWorld().removeObject(langosta);
         //langostaalive=0;
         Greenfoot.playSound("eating.wav");
         getWorld().showText(null, getX(), getY());
         redimensionar();
         }
         
    }
    }
    public void redimensionar(){
        GreenfootImage ballena=getImage();
        double ancho=ballena.getHeight()*1.15;
        double alto=ballena.getWidth()*1.15;
        int ancho1=(int) ancho;
        int alto1=(int) alto;
        ballena.scale(ancho1,alto1);
    }
}
