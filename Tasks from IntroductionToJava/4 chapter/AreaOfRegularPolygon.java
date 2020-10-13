import java.util.*;
public class AreaOfRegularPolygon{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how much sides of polygon: ");
		double n = in.nextDouble();

		System.out.print("Enter the side: ");
		double s = in.nextDouble();

		double area = (n * Math.pow(s,2))/(4 * Math.tan(Math.PI / n));
		System.out.println("The area of the polygon is " + area);
	}
}