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
    /**
     * Constructor for objects of class MyLevels.
     * 
     */
    public MyLevels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(580, 600, 1); 
    }
    
    public void updateScore(int jotaroScore)
    {
        this.showText("Puntaje: " + jotaroScore, 500,35);
    }
    
    public HealthBar getHealthBar(){
        return healthBar;
    }
}
