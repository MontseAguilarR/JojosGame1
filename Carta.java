import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta extends Actor
{
     GifImage cGif1= new GifImage("Carta 1 sol.gif");
    public void act()
    {
        setImage(cGif1.getCurrentImage());    
    }
}
