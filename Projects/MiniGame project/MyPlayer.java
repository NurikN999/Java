
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class MyPlayer implements Player{
    private Circle ball;
    private Map map;
    private Position position;

    public MyPlayer(Map mapPane){
        this.map = mapPane;
        ball =  new Circle((map.getStartPosition().getX()+ map.getUnit()*0.5),(map.getStartPosition().getY()+ map.getUnit() *0.5), map.getUnit()/2);
        ball.setFill(Color.RED);
        ball.setStroke(Color.BLACK);
        position = map.getStartPosition();

    }



    @Override
    public void moveUp(){
        if(ball.getCenterY() - map.getUnit()*0.5>0){
            if(map.getValue(position.getY() - 1, position.getX()) != 1){
                ball.setCenterY(ball.getCenterY()- map.getUnit());
                position.setY(position.getY()-1);
            }

        }
        else
            System.out.println("Invalid Position...\n");
    }

    @Override
    public void moveDown(){
        if(ball.getCenterY()< map.getUnit()* map.getSize()- map.getUnit()){
            if(map.getValue(position.getY() + 1 , position.getX())!= 1){
                ball.setCenterY(ball.getCenterY()+ map.getUnit());
                position.setY(position.getY()+1);
            }

        }
        else
            System.out.println("Invalid Position...\n");



    }

    @Override
    public void moveRight(){
        if(ball.getCenterX()< map.getUnit()* map.getSize()- map.getUnit()){
            if(map.getValue(position.getY(),position.getX() + 1)!= 1){
                ball.setCenterX(ball.getCenterX() + map.getUnit());
                position.setX(position.getX()+1);

            }
        }
        else
            System.out.println("Invalid Position...\n");
    }

    @Override
    public void moveLeft(){
        if(ball.getCenterX()- map.getUnit()*0.5>0){
            if(map.getValue( position.getY(),position.getX() - 1)!= 1){
                ball.setCenterX(ball.getCenterX()- map.getUnit());
                position.setX(position.getX()-1);
            }

        }
        else
            System.out.println("Invalid Position...\n");
    }

    @Override
    public Position getPosition(){
        return this.position;
    }

    public Circle getBall(){
        return this.ball;
    }


}
