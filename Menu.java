import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    
   
    
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    

        super(580, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Jugar jugar = new Jugar();
        addObject(jugar,303,364);
        jugar.setLocation(290,341);
        Ayuda ayuda = new Ayuda();
        addObject(ayuda,195,393);
        Records records = new Records();
        addObject(records,321,460);
    }
    
   
}
