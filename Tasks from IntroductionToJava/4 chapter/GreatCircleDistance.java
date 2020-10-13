import java.util.*;
public class GreatCircleDistance{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double radius = 6371.01;

		double x1rad = Math.toRadians(x1);
		double y1rad = Math.toRadians(y1);
		double x2rad = Math.toRadians(x2);
		double y2rad = Math.toRadians(y2);

		double distance = radius * Math.acos(Math.sin(x1rad) * Math.sin(x2rad) + Math.cos(x1rad) * Math.cos(x2rad) * Math.cos(y1rad - y2rad));
		System.out.println("The distance between the two points is " + distance + " km");
	}
}