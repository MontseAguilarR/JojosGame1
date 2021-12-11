import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends MyLevels implements ScoreManager
{
    private GreenfootSound myWorldEndSound=new GreenfootSound("Musica FinalEnemigo.mp3");
    HealthBar healthBarDio=new HealthBar();
    HealthBar healthBarJotaro=new HealthBar();
    

     public MyWorld3()
    {     
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    
    public void act()
    {
        myWorldEndSound.play();
        returnToMenu();
        
    }
    public void returnToMenu()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
         Greenfoot.setWorld(new Menu());
                       
        }
    }
    
    public void updateScore(int jotaroScore)
    {
        this.showText("Puntaje: " + jotaroScore, 500,35);
    }
    
    public HealthBar getHealthBar(){
        return healthBarJotaro;
    }
    
    public HealthBar getHealthBarDio(){
        return healthBarDio;
    }
    
    private void prepare()
    {
        addObject(new Dio(),435,176);
        addObject(new Jotaro(this),65,547);
        addObject(healthBarJotaro,282,559);
        addObject(healthBarDio,293,44);

        int direction=Greenfoot.getRandomNumber(360);
        addObject(new BalaDio(direction), 300, 200);
        addObject(new BalaDio(direction+10), 534, 355);
        addObject(new BalaDio(direction-30), 342, 301);
        addObject(new BalaDio(direction-45), 435, 354);
        addObject(new BalaDio(direction-45), 300, 99);
        
        addObject(new Esmerald(),32,102);
        addObject(new Esmerald(),546,291);
        addObject( new Esmerald(),102,486);
        addObject(new Esmerald(),223,165);
        addObject(new Esmerald(),155,351);
        addObject(new Esmerald(),286,541);
        
        addObject(new Carta(),420,482);
        addObject(new Carta(),354,101);
        addObject(new Carta(),287,290);
    }
}
