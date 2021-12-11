import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dio extends Actor
{
     private GreenfootSound dioAtack=new GreenfootSound("DioAtack.mp3");
    private GreenfootSound dioDie=new GreenfootSound("DioDie.mp3");
     GifImage dioGif= new GifImage("Dio.gif");
    public void act()
    {
        dioAtack.play();
        setImage(dioGif.getCurrentImage());
        dioDie();
        
    }
    
    public void dioDie(){
        
        boolean touchingPuñoStar=false;
        Actor puñoStar=getOneIntersectingObject(StarGolpes.class);
        if(puñoStar!=null){
            World world=getWorld();
            MyWorld3 myWorld=(MyWorld3)world;
            HealthBar healthBar=myWorld.getHealthBarDio();
            if(touchingPuñoStar==false)
            {
                healthBar.loseHealth();
                touchingPuñoStar=true;
                if(healthBar.health<=0)
                {
                    getWorld().removeObjects(getWorld().getObjects(BalaDio.class));
                    getWorld().removeObjects(getWorld().getObjects(Esmerald.class));
                    getWorld().removeObjects(getWorld().getObjects(Carta.class));
                    getWorld().removeObject(this);
                    dioDie.play();
                    Greenfoot.setWorld(new WinScreen());
                    
                }
            }
            
            }else{
                 touchingPuñoStar=false;
            }
           
    }
}
