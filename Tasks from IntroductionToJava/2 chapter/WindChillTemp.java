import java.util.*;
public class WindChillTemp{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
		double outsideTemp = in.nextDouble();

		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double v = in.nextDouble();

		double windChillTemp = 35.74 + (0.6215 * outsideTemp) - (35.75 * Math.pow(v,0.16) + (0.4275 * outsideTemp * Math.pow(v,0.16)));
		System.out.println("The wind chill index is " + windChillTemp);
	}
}