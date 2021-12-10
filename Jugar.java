import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugar extends Buttons
{
    
    
    public void act()
    {
        checkMouse();
        checkClick(new MyWorld());
    }
}
