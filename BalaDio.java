import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BalaDio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalaDio extends Actor
{
    GifImage bolaDioGif= new GifImage("BalaDio.gif");
    public void act()
    {
        setImage(bolaDioGif.getCurrentImage());
        move(10);
        
        if(atWorldEdge())
        {
            turn(153);
        }
    }
    
    public BalaDio(int direction)
    {
        setRotation(direction);
    }
    
    public boolean atWorldEdge()
    {
        if(getX()<10 || getX()>getWorld().getWidth() -10)
        {
            return true;
        }
        if(getY()<10 || getY()>getWorld().getHeight() -10)
        {
            return true;
        }else
        {
            return false;
        }
    
    }
}
