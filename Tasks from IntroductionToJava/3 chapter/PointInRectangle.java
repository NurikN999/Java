import java.util.*;
public class PointInRectangle{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = in.nextDouble();
		double y = in.nextDouble();

		if((Math.pow(Math.pow(x, 2), 0.5) <= 10 / 2 ) || (Math.pow(Math.pow(y, 2), 0.5) <= 5.0 / 2))	
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
		else
			System.out.println("Point (" + x + ", " + y + ") isn't in the rectangle");
	}
}