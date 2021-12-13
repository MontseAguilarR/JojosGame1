import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyLevels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyLevels extends World 
{
    HealthBar healthBar=new HealthBar();
    
    
    public MyLevels()
    {    
        super(580, 600, 1);
    }
     public void act() {
     
    
    }
         
    
    public void updateScore(int jotaroScore)
    {
        this.showText("Puntaje: " + jotaroScore, 500,35);
    }
    
    public HealthBar getHealthBar(){
        return healthBar;
    }
}
