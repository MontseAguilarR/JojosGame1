import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        puñoTouchWall();
    }
    
    public void puñoTouchWall()
    {
     Actor starGolpes=getOneIntersectingObject(StarGolpes.class);
        if(starGolpes!=null)
        {
            
            getWorld().removeObject(starGolpes);
            World world=getWorld();
            
        
        } 
    }
}
