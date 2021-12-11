import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarGolpes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarGolpes extends Actor
{
    private GreenfootSound enemyDie=new GreenfootSound("enemigoMuerte.mp3");
    public void act()
    {
        
        move(10);
        
       
        Actor enemigo1=getOneIntersectingObject(Enemigo1.class);
        if(enemigo1!=null)
        {
            enemyDie.play();
            getWorld().removeObject(enemigo1);
            World world=getWorld();
            
        
        }else if(hitTheEdge()!=null){
            World myWorld=getWorld();
            myWorld.removeObject(this);
        }
        }
    

    public String hitTheEdge()
    {
        int x=getX();
        int y=getY();
        World myWorld=getWorld();
        int rightSide=myWorld.getWidth() - 1;
        int bottomSide=myWorld.getHeight() -1;
        
        if(y==0)
        {
            return"top";
        }else if(x==0)
        {
           return "left";   
        }
        else if(x==rightSide)
        {
           return "right";   
        }else if(y==bottomSide){
           return "bottom";   
        }else{
            return null;
        }
    }
   
}