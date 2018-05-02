package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;

public class BodyPart {
    
    private int xCoor, yCoor, width, height;
    
    public BodyPart(int xCoor, int yCoor, int tileSize){
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height = tileSize;
    }
    public void tick(){
        //Updating
    }
    public void draw(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(xCoor*width, yCoor * width, width, height);
        g.setColor(Color.GREEN);
        g.fillRect(xCoor*width + 2, yCoor *height +2, width, height);
    }
}
