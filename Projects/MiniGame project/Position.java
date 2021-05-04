import java.util.Scanner;

public class Position{
    private int x;
    private int y;

    public boolean equals (Position object){
        if (this.x==object.getX() && this.y==object.getY())
            return true;
        else
            return false;
    }

    public Position (int x1,int y1){
        this.x = x1;
        this.y = y1;
    }

    //change x
    public void setX(int x2){
        this.x=x2;
    }

    //change y
    public void setY(int y2){
        this.y=y2;
    }

    // returns x
    public int getX(){
        return this.x;
    }

    //returns y
    public int getY(){
        return this.y;
    }



}