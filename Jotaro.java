import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Jotaro extends Actor{
    private static int OFFSET=5;
    public static int score;
    public ScoreManager scoreManager;
    private GreenfootSound esmeraldaSound=new GreenfootSound("SonidoEsmeralda.mp3");
    private GreenfootSound cartaSound=new GreenfootSound("SonidoCarta.mp3");
    private GreenfootSound jotaroAtack=new GreenfootSound("Jotaro Ataca.mp3");
    private GifImage jGif1= new GifImage("Jotaro sprite stand FF.gif");
    private GifImage jGifWR= new GifImage("Jotaro walk right.gif");
    private GifImage jGifWL= new GifImage("Jotaro walk left.gif");
    private GifImage jGifWB= new GifImage("Jotaro walk back.gif");
    private GifImage jGifWF= new GifImage("Jotaro walk front.gif");
    
    
    
    
    Jotaro()
    {
        
    }
    
    Jotaro(ScoreManager scoreManager){
        this.scoreManager=scoreManager;
    }
    
    public void act(){
        setImage(jGif1.getCurrentImage());
        handleKeys();
        itemsPick();
        jotaroDie();
        oraOraAtack2();
        jotaroHealthBar();
        
    }
    
    

    
    private void handleKeys(){
        int x=getX();
        int y=getY();
        
        if(Greenfoot.isKeyDown("right")&& getOneObjectAtOffset(OFFSET, 0, Wall.class)==null)
        {
            setLocation(x + OFFSET , y);
        
            setImage(jGifWR.getCurrentImage());
            
        }else if(Greenfoot.isKeyDown("down")&& getOneObjectAtOffset(0,OFFSET, Wall.class)==null)
        {
            setLocation(x , OFFSET + y);
            setImage(jGifWF.getCurrentImage());
            
        }else if(Greenfoot.isKeyDown("left")&& getOneObjectAtOffset(-OFFSET, 0, Wall.class)==null)
        {
            setLocation(x - OFFSET , y);
            setImage(jGifWL.getCurrentImage());
            
        }else if(Greenfoot.isKeyDown("up")&& getOneObjectAtOffset(0, -OFFSET, Wall.class)==null)
        {
            setLocation(x , y - OFFSET);
            setImage(jGifWB.getCurrentImage());
        }
    
    }
    
    private void itemsPick()
    {
        Actor esmerald=getOneIntersectingObject(Esmerald.class);
        
        if(esmerald!=null)
        {
            score+=5;
            getWorld().removeObject(esmerald);
            World world=getWorld();
            scoreManager.updateScore(score);
            playE();
        }
        
        Actor carta=getOneIntersectingObject(Carta.class);
        
        if(carta!=null)
        {
            score+=8;
            getWorld().removeObject(carta);
            World world=getWorld();
            scoreManager.updateScore(score);
            playC();
        }
        
    }
    
    
    public void oraOraAtack2(){
        
        if(Greenfoot.mousePressed(null))
        {
          
            jotaroAtack.play();
            StarGolpes starGolpes=new StarGolpes();
            getWorld().addObject(starGolpes, getX(), getY());
            starGolpes.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
        
    }
    
    public void jotaroHealthBar()
    {
        HealthBar jojoHealth=new HealthBar();
        jojoHealth.health=50;
    }
    
    
    public void jotaroDie(){
        GameOver gameOver=new GameOver();
        Startbutton startButton=new Startbutton();
        boolean touchingEnemigo1=false;
        Actor enemigo1=getOneIntersectingObject(Enemigo1.class);
        boolean touchingBalaDio=false;
        Actor balaDio=getOneIntersectingObject(BalaDio.class);
        if(enemigo1!=null || balaDio!=null){
            World world=getWorld();
            MyLevels myWorld=(MyLevels)world;
            HealthBar healthBar=myWorld.getHealthBar();
            if(touchingEnemigo1==false || touchingBalaDio==false)
            {
                score=score-5;
                healthBar.loseHealth();
                touchingEnemigo1=true;
                touchingBalaDio=true;
                if(healthBar.health<=0)
                {
                    myWorld.addObject(startButton, 288, 542);
                    myWorld.addObject(gameOver, 289,321);
                    getWorld().removeObject(this);
                    saveScore();
                }
            }
            
            }else{
                 touchingEnemigo1=false;
                 touchingBalaDio=false;
            }
            
    }

    public void saveScore()
    {
        String name=Greenfoot.ask("Introduce tu nombre: ");
        Record record=new Record(name, score);
        RecordManager recordManager=new RecordManager(5, "RecordFile.txt");
        recordManager.save(record);
    }
    
    public void moreFast(){
        MyWorld3 myWorld3=new MyWorld3();
        if(myWorld3!=null)
        {
            OFFSET=7;
        }
    }
    
    public void playE(){
       esmeraldaSound.play();
    }
    
    public void playC(){
        cartaSound.play();
    }
    
     
}


