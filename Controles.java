import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controles extends World
{
    private GreenfootSound menuSound=new GreenfootSound("menuSound.mp3");
    private GreenfootSound startSound=new GreenfootSound("start.mp3");
    /**
     * Constructor for objects of class Controles.
     * 
     */
    public Controles()
    {    

        super(580, 600, 1); 

        prepare();
    }

    public void act()
    {
        play();
        if(Greenfoot.isKeyDown("enter"))
        {
            startSound.play();
            stop();
            Greenfoot.setWorld(new Controles2());
        }
    }

    public void play(){
        menuSound.play();
    }

    public void stop(){
        menuSound.stop();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Startbutton startbutton = new Startbutton();
        addObject(startbutton,307,583);
    }
}
