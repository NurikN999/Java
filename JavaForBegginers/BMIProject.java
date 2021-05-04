import javax.swing.*;
public class BMIProject{
    public static void main(String[] args){
        double mass, height, bmi;
        String result;

        result = JOptionPane.showInputDialog("Your height (in meters)?");
        height = Double.parseDouble(result);

        result = JOptionPane.showInputDialog("Your mass (in kilo)?");
        mass = Double.parseDouble(result);

        bmi = mass/Math.pow(height,2);
        bmi = Math.round(bmi * 100) / 100.0;

        JOptionPane.showMessageDialog(null, "Your BMI is: " + bmi);
    }
}