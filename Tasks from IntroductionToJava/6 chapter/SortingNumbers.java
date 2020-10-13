import java.util.Scanner;

public class ExercisesFromBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        displaySortedNumbers(a,b,c);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
        if(num1 > num2){
            double temp = num2;
            num2 = num1;
            num1 = temp;
        }
        if(num2 > num3){
            double temp = num3;
            num3 = num2;
            num2 = temp;
        }
        if(num1 > num3){
            double temp = num3;
            num3 = num1;
            num1 = temp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
