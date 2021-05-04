import java.util.*;
import javax.swing.*;

public class FirstLittleProject{
    public static void main(String[] args){

        double salary,remainder,expenses;
        String result;

        result = JOptionPane.showInputDialog("Enter your monthly salary(in tenge)?");
        salary = Double.parseDouble(result);

        result = JOptionPane.showInputDialog("Enter your monthly expenses(in tenge)?");
        expenses = Double.parseDouble(result);

        remainder = salary - expenses;

        double res = 0;
        for(int i = 0; i < 12; i++){
            res += (remainder + (res * 0.01));
        }

        JOptionPane.showMessageDialog(null, "If you will save your money in Kaspi Deposit, after 1 year you will have: " + (Math.floor(res * 100) / 100) + " tenge");
    }
}