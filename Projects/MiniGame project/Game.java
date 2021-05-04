
import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;
import java.io.FileNotFoundException;

import javafx.scene.Scene;

public class Game extends Application {
    private MyPlayer player;
    private Food food;
    private Map map;


    @Override
    public void start(Stage primaryStage)throws FileNotFoundException{
        Scanner input = new Scanner(System.in);

        System.out.println("Please, type name of map file :");
        String nameOfFile = input.nextLine();

        map = new Map(nameOfFile);
        player = new MyPlayer(map);
        food = new Food(map, player);

        map.getChildren().addAll(player.getBall());

        player.getBall().setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    player.moveDown(); break;
                case UP:
                    player.moveUp(); break;
                case LEFT:
                    player.moveLeft(); break;
                case RIGHT:
                    player.moveRight(); break;
            }
        });



        Scene scene = new Scene(map,map.getSize()* map.getUnit(),map.getSize()* map.getUnit());
        primaryStage.setTitle("Game");
        primaryStage.setScene(scene);
        primaryStage.show();


        player.getBall().requestFocus();
        food.getPoints();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
