import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo) 
import greenfoot.Color;

public class HealthBar extends Actor
{
    int health=300;
    int healthBarWidth=300;
    int healthBarHeight=20;
    int pixelsPerHealthPoint=(int)healthBarWidth/health;
    
    public HealthBar(){
        update();
    }
    public void act()
    {
        update();
    }
    
    public void update(){
        setImage(new GreenfootImage(healthBarWidth+2, healthBarHeight+2));
        GreenfootImage myImage=getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0,0,healthBarWidth+1,healthBarHeight+1);
        myImage.setColor(Color.RED);
        myImage.fillRect(1,1,health*pixelsPerHealthPoint,healthBarHeight);
    }
    
    public void loseHealth(){
        health--;
    }
}
