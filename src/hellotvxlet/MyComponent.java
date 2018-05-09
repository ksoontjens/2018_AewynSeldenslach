package hellotvxlet;

import java.awt.*;
import org.havi.ui.*;

public class MyComponent extends HComponent implements Runnable{
    
    Graphics gfx;
    Image img;
    Thread thread;
    Snake snake;
    
    public MyComponent(){
        this.setBounds(0,0,720,576);
        img = createImage(720,576);
        gfx = img.getGraphics();
        snake = new Snake();
        thread = new Thread(this);
        thread.start();
    }
    
    public void paint(Graphics g){
        gfx.setColor(Color.black);
        gfx.fillRect(0,0,720,576);
        snake.draw(gfx);
        
               
        
        g.drawImage(img, 0, 0, null);
    }
    
    public void update(Graphics g){
        paint(g);
    }
    
    public void repaint(Graphics g){
        paint(g);
    }
    public void run(){
        for(;;){
            this.repaint();
            try {
                Thread.sleep(40);
            } 
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
