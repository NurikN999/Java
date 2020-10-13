import java.util.*;
public class first_ex{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		int celcius = in.nextInt();
		double fahrenheit = (9.0 / 5) * celcius + 32;
		System.out.println(celcius + " Celsius is " + fahrenheit + " Fahrenheit");
	}
}