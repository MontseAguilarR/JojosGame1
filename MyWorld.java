import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends MyLevels implements ScoreManager
{
    private GreenfootSound myWorldSound=new GreenfootSound("MyWorldSound.mp3");
    HealthBar healthBar=new HealthBar();
    
    
    public MyWorld()
    {    

        prepare();
    }
    
    public HealthBar getHealthBar(){
        return healthBar;
    }
    
    public void act()
    {
        play();
        enterNextLevel();
        myWorldSound.setVolume(50);
    }
    
    public void enterNextLevel()
    {
        
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld2());
            stop();
        }
    }
    
    public void play(){
       myWorldSound.play();
    }
    public void stop(){
        
            myWorldSound.stop();   
    }
    
    public void updateScore(int jotaroScore)
    {
        this.showText("Puntaje: " + jotaroScore, 500,35);
    }
    
    private void prepare()
    {
        this.showText("Puntaje", 500, 35);

        addObject(healthBar,293,44);
        addObject(new Carta(),542,546);
        addObject(new Esmerald(),479,547);
        addObject(new Esmerald(),413,545);
        addObject(new Esmerald(),351,546);
        addObject(new Esmerald(),159,227);
        addObject(new Esmerald(),222,226);
        addObject(new Esmerald(),349,227);
        addObject(new Esmerald(),416,227);
        addObject(new Esmerald(),543,163);
        addObject(new Esmerald(),157,417);
        addObject(new Esmerald(),545,418);
        addObject(new Esmerald(),477,419);
        addObject(new Esmerald(),352,418);
        addObject(new Carta(),30,418);
        addObject(new Esmerald(),27,294);
        addObject(new Esmerald(),289,293);
        addObject(new Esmerald(),542,293);
        addObject(new Carta(),32,34);
        addObject(new Esmerald(),92,105);
        addObject(new Esmerald(),224,100);
        addObject(new Esmerald(),350,100);
        addObject(new Esmerald(),479,98);
        addObject(new Esmerald(),413,165);
        addObject(new Esmerald(),286,165);
        addObject(new Esmerald(),160,164);
        addObject(new Esmerald(),30,162);
        addObject(new Enemigo1(),101,412);

    
        addObject(new Jotaro(),30,548);

        
        addObject(new Wall(),32,482);
        addObject(new Wall(),95,485);
        addObject(new Wall(),159,484);
        addObject(new Wall(),225,484);
        addObject(new Wall(),286,482);
        addObject(new Wall(),545,484);
        addObject(new Wall(),349,484);
        addObject(new Wall(),545,342);
        addObject(new Wall(),478,342);
        addObject(new Wall(),415,343);
        addObject(new Wall(),31,338);
        addObject(new Wall(),95,338);
        addObject(new Wall(),159,338);
        addObject(new Wall(),224,339);
        addObject(new Wall(),30,212);
        addObject(new Wall(),97,213);
        addObject(new Wall(),480,209);
        addObject(new Wall(),545,208);

        addObject(new Enemigo1(),100,268);
    }
}

