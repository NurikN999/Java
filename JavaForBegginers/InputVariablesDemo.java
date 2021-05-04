import java.util.*;
import javax.swing.*;
public class InputVariablesDemo{
    public static void main(String[] args){
        int age,year,birth;
        String result;

        result = JOptionPane.showInputDialog("What is the year now?");
        year = Integer.parseInt(result);

        result = JOptionPane.showInputDialog("How old are you?");
        age = Integer.parseInt(result);

        birth = year - age;
        JOptionPane.showMessageDialog(null,"You were born in " + birth + " year");
    }
}