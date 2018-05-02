package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import javax.tv.xlet.*;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.UserEvent;
import org.havi.ui.*;


public class HelloTVXlet implements Xlet {

    HScene scene;
    public static final int WIDTH = 800, HEIGHT = 800;
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
        //Template maken
        HSceneTemplate sceneTemplate = new HSceneTemplate();
        //Grootte en positie ingeven
        sceneTemplate.setPreference(org.havi.ui.HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(org.havi.ui.HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f, 0.0f), HSceneTemplate.REQUIRED);
        //Een instantie van een Scene vragen aan de factory
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
        
    }

    public void startXlet() {
        //Scene zichtbaar maken
        scene.validate();
        scene.setVisible(true);
        
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        for(int i = 0; i < WIDTH/10; i++){
            g.drawLine(i*10, 0, i*10, HEIGHT);
        }
        for(int i = 0; i < HEIGHT/10; i++){
            g.drawLine(0, i*10, WIDTH, i*10);
        }
    }
    
    public void userInput(UserEvent e){
        if(e.getType() == HRcEvent.KEY_PRESSED){
            if(e.getCode() == HRcEvent.VK_RIGHT){
                //Snake goes right
            }
            if(e.getCode() == HRcEvent.VK_LEFT){
                //Snake goes left
            }
            if(e.getCode() == HRcEvent.VK_UP){
                //snake goes up
            }
            if(e.getCode() == HRcEvent.VK_DOWN){
                //Snake goes down
            }
            try {
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
