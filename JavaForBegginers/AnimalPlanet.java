import java.util.*;
import static javax.swing.JOptionPane.*;
import javax.swing.*;

public class AnimalPlanet{
    public static void main(String[] args){
        String[] txt = {"Wolf","Fox","Bear"};
        String[] files = {"wolf.jpg","bear.png","fox.png"};

        String folder = "C:/Users/Nurik/Desktop/Pictures";
        String msg = "What animal you want to see?";
        String title = "Animal Planet";

        ImageIcon img = new ImageIcon(folder + "giraffe.jpg");
        String animal;

        animal = (String)showInputDialog(null, msg, title, PLAIN_MESSAGE, img, txt,txt[0]);
        
        if(animal == null){
            System.exit(0);
        }

        for(int i = 0; i < txt.length; i++){
            if(animal.equals(txt[i])){
                img = new ImageIcon(folder + files[i]);
                break;
            }
        }
        showMessageDialog(null, img, animal, PLAIN_MESSAGE);
    }
}