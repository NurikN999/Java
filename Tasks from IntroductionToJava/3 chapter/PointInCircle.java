import java.util.*;

public class PointInCircle{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double x = in.nextInt();
		double y = in.nextInt();

		double distance = Math.pow(Math.pow((x - 0) , 2) + Math.pow((y - 0) , 2) , 0.5);

		if(distance > 10)
			System.out.println("Point (" + x + ", " + y + ") isn't in the circle");
		else
			System.out.println("Point (" + x + ", " + y + ") is in the circle");
	}
}