

import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;



public class Map extends Pane{
    private int UNIT =50;
    private int size;
    private int[][] map;
    private Position start;

    public Map(String nameOfMap) throws FileNotFoundException {
        try{
            this.start = new Position(0, 0);
            File file = new File(nameOfMap);
            Scanner in = new Scanner(file);
            size = in.nextInt();
            map = new int[size][size];
            for (int row = 0; row < map.length; row++) {
                for (int column = 0; column < map[row].length; column++) {
                    map[row][column] = in.nextInt();
                }
            }
            in.close();
        }

        catch(Exception e){

        }
        for (int row = 0; row < map.length; row++) {
            for (int column = 0; column < map[row].length; column++) {
                if(map[row][column]==1){
                    Rectangle rake = new Rectangle(column* UNIT, row* UNIT, UNIT, UNIT);
                    rake.setStroke(Color.BLACK);
                    rake.setFill(Color.BLACK);
                    getChildren().add(rake);
                }
                else{
                    if(map[row][column]==0){
                        Rectangle rake = new Rectangle(UNIT *column, UNIT *row, UNIT, UNIT);
                        rake.setStroke(Color.BLACK);
                        rake.setFill(Color.WHITE);
                        getChildren().add(rake);

                    }
                    if(map[row][column]==2){
                        start.setX(row);
                        start.setY(column);
                        Rectangle rake = new Rectangle(UNIT *column, UNIT *row, UNIT, UNIT);
                        rake.setStroke(Color.BLACK);
                        rake.setFill(Color.WHITE);
                        getChildren().add(rake);
                    }


                }

            }

        }
    }

    public int getValue(int n, int m){
        return this.map[n][m];
    }

    public Position getStartPosition(){
        return this.start;
    }

    public int getUnit(){
        return UNIT;
    }

    public int getSize(){
        return size;
    }






}
