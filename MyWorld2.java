import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends MyLevels implements ScoreManager
{
    private GreenfootSound myWorld2Sound=new GreenfootSound("MyWorldSound.mp3");
   HealthBar healthBar=new HealthBar();
   
    public MyWorld2()
    {   
        
        prepare();
    }
    
    public void act(){
        myWorld2Sound.play();
        enterNextLevel();
    }

      public HealthBar getHealthBar(){
        return healthBar;
       }

    public void enterNextLevel()
    {
        
        
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld3());
            myWorld2Sound.stop();
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        this.showText("Puntaje", 500, 35);
        addObject(healthBar,293,44);
        
        
        addObject(new Jotaro(this),31,37);
        
        addObject(new Wall(),31,164);
        addObject(new Wall(),544,162);
        addObject(new Wall(),479,164);
        addObject(new Wall(),415,163);
        addObject(new Wall(),353,164);
        addObject(new Wall(),288,164);
        addObject(new Wall(),222,164);
        addObject(new Wall(),31,323);
        addObject(new Wall(),95,323);
        addObject(new Wall(),161,322);
        addObject(new Wall(),350,324);
        addObject(new Wall(),417,325);
        addObject(new Wall(),479,325);
        addObject(new Wall(),543,324);
        addObject(new Wall(),31,484);
        addObject(new Wall(),95,482);
        addObject(new Wall(),161,483);
        addObject(new Wall(),223,482);
        addObject(new Wall(),288,482);
        addObject(new Wall(),480,484);
        addObject(new Wall(),545,484);
        
        addObject(new Carta(),30,553);
        addObject(new Carta(),546,418);
        addObject(new Carta(),29,227);
        
        addObject(new Esmerald(),95,549);
        addObject(new Esmerald(),542,548);
        addObject(new Esmerald(),413,483);
        addObject(new Esmerald(),349,484);
        addObject(new Esmerald(),34,416);
        addObject(new Esmerald(),97,417);
        addObject(new Esmerald(),290,324);
        addObject(new Esmerald(),480,419);
        addObject(new Esmerald(),545,227);
        addObject(new Esmerald(),160,225);
        addObject(new Esmerald(),352,224);
       
        addObject(new Enemigo1(),98,236);
        addObject(new Enemigo1(),71,399);
        addObject(new Enemigo1(),64,552);
    }
}
