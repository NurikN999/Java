import java.util.*;
public class ConvertBetweenCelsiusAndFahrenheit {
    public static void main(String[] args) {
        int i = 40;
        int j = 120;
        System.out.println("Celsius \t Fahrenheit \t | \t Fahrenheit \t Celsius");
        for (double celsius = 40.0, fahrenheit = 120.0;
             celsius >= 31.0; celsius--, fahrenheit -= 10) {
            System.out.printf("%-12.1f", celsius);
            System.out.printf("  %-15.1f|", celsiusToFahrenheit(celsius));
            System.out.printf("     %-15.1f", fahrenheit);
            System.out.printf("%-7.2f\n\n", fahrenheitToCelsius(fahrenheit));
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}