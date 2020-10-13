import java.util.*;
public class AreaOfTriangle{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three points for a triangle: ");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();


		double x2x1 = (Math.pow((x2-x1) , 2));
		double y2y1 = (Math.pow((y2-y1) , 2));
		
		double x3x2 = (Math.pow((x3-x2) , 2));
		double y3y2 = (Math.pow((y3-y2) , 2));

		double x3x1 = (Math.pow((x3-x1) , 2));
		double y3y1 = (Math.pow((y3-y1) , 2));

		double side1 = Math.pow( x2x1 + y2y1, 0.5);
		double side2 = Math.pow( x3x2 + y3y2, 0.5);
		double side3 = Math.pow( x3x1 + y3y1, 0.5);
		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)) , 0.5);
		System.out.println("The area of the triangle is " + area);
	}
}