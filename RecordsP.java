import greenfoot.*;  
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class RecordsP extends World
{
    int coordenada = 200;
    public RecordsP(){
        super(580, 600, 1);  
    }
   
    public void act(){
       imprimeGameScore(); 
        enterToMain();
    }
    
    public void imprimeGameScore(){
        
        String puntuacion;
        try{
            File Archivo = new File("RecordFile.txt");    
            Scanner Entrada = new Scanner(new FileReader(Archivo));
    
            do{
                puntuacion = Entrada.next();
                showText(puntuacion,300,coordenada);
                coordenada+=50;
            }while(Entrada.hasNext());
        
            } catch (IOException e){
          
            }  
    }
    
    public void enterToMain()
    {
        
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld2());
            
        }
    }
}

