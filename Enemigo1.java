import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemigo1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo1 extends Actor
{
    GifImage eGif1= new GifImage("enemigo1.gif");
    int cont=1;
    int speed=3;
    public void act()
    {
        setImage(eGif1.getCurrentImage());
        cont++;
        //enemyAtack();
        moveAround();
        
        MyWorld2 myWorld2=new MyWorld2();
        
    }
    
    public void moveAround(){
       
        if(cont<150)
        {
            setLocation(getX()+speed, getY());
        }else{
            speed=-speed;
            getImage().mirrorHorizontally();
            cont=0;
        }
        
    }
 }

