import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controles2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controles2 extends World
{
    
    private GreenfootSound startSound=new GreenfootSound("start.mp3");

public Controles2()
    {    

        super(580, 600, 1); 

        prepare();
    }

    public void act()
    {
        
        if(Greenfoot.isKeyDown("enter"))
        {
            startSound.play();
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    private void prepare()
    {
        Startbutton startbutton = new Startbutton();
        addObject(startbutton,307,583);
    }
}
