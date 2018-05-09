package hellotvxlet;

import javax.tv.xlet.*;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.EventManager;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.*;


public class HelloTVXlet implements Xlet {

    HScene scene;
    MyComponent mc;
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
        this.startGame();
    }
    public void startGame(){
        mc = new MyComponent();
        
        scene = HSceneFactory.getInstance().getDefaultHScene();
        scene.add(mc);
        scene.validate();
        scene.setVisible(true);
        
        UserEventRepository uev = new UserEventRepository("Inputs");
        uev.addAllArrowKeys();
        
        EventManager.getInstance().addUserEventListener((UserEventListener) this,uev);
    }

    public void startXlet() {
        
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void userEventReceived(UserEvent e){
        if(e.getType() == HRcEvent.KEY_PRESSED){
            if(e.getCode() == HRcEvent.VK_UP){
                //Snake goes right
            }
            if(e.getCode() == HRcEvent.VK_DOWN){
                //Snake goes left
            }
            if(e.getCode() == HRcEvent.VK_LEFT){
                //snake goes up
            }
            if(e.getCode() == HRcEvent.VK_RIGHT){
                //Snake goes down
            }
        }
    }
}
