import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinScreen extends World
{

    /**
     * Constructor for objects of class WinScreen.
     * 
     */
    public WinScreen()
    {    
        
        
        super(580, 600, 1);  
    }
    
    public void act(){
        boolean oneTime=false;
       if(oneTime==false)
        {
            get();
            Greenfoot.setWorld(new Menu());
            oneTime=true;
        }
        
    }
    
    public void get()
    {
        Jotaro jotaro=new Jotaro();
        jotaro.saveScore();
    }
}
