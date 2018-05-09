package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;

public class Snake {
    Point[] snakePoints;
    
    //Om te bepalen OF en WAARHEEN de slang beweegt
    int xDir, yDir;
    boolean isMoving, elongate;
    final int STARTSIZE = 20, STARTX = 150, STARTY = 150;
    
    public Snake(){
        //Pixels of screen/4(size of snake) for length
        snakePoints = new Point[51840];
        
        xDir = 0;
        yDir = 0;
        isMoving = false;
        elongate = false;
        snakePoints[0] = new Point(STARTX, STARTY);
        for (int i = 1; i < STARTSIZE; i++){
            snakePoints[i] = new Point(STARTX - i * 4, STARTY);
        }
    }
    
    public void draw(Graphics g){
        g.setColor(Color.WHITE);
        for(int i = 0; i < snakePoints.length; i++){
            g.fillRect(snakePoints[i].getX(), snakePoints[i].getY(), 4, 4);
        }
    }
    public int getxDir(){
        return xDir;
    }    
    
    public int getyDir(){
        return yDir;
    }
    
    public void setxDir(int x){
        xDir = x;
    }
    public void setyDir(int y){
        yDir = y;
    }
    
    public int getX(){
        //get xPos of head of the snake
        return snakePoints[0].getX();
    }
    
        public int getY(){
        //get xPos of head of the snake
        return snakePoints[0].getY();
    }
}
