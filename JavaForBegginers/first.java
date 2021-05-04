import java.util.*;
import javax.swing.JOptionPane;
public class first{
    public static void main(String[] args){
        int x = 15;
        double y = 45.5;
        float z = 20.15f;

        String text = "Integer number: " + x + "\nDouble number: " + y + "\nFloat number: " + z;

        JOptionPane.showMessageDialog(null, text);
    }
}