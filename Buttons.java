import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    private boolean mouseOver=false;
    private static int MAX_TRANS=255;
    private GreenfootSound startSound=new GreenfootSound("start.mp3");
    
    public void checkMouse()
    {
        if(Greenfoot.mouseMoved(null))
        {
             mouseOver=Greenfoot.mouseMoved(this);
        }
        
        if(mouseOver)
        {
            adjTrans(MAX_TRANS/2);
        }else{
            adjTrans(MAX_TRANS);
        }
    }
    
    public void checkClick(World world)
    {
        
        if(Greenfoot.mouseClicked(this))
        {
            startSound.play();
            Greenfoot.setWorld(world);
        }
    }
    
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage=getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
}