import java.util.*;
public class DistanceOfTwoPoints{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x1 and y1: ");

		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		System.out.print("Enter x2 and y2: ");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x2x1 = (Math.pow((x2-x1) , 2));
		double y2y1 = (Math.pow((y2-y1) , 2));
		double distance = Math.pow( x2x1 + y2y1, 0.5);
		System.out.println("The distance between the two points is " + distance);
	}
}