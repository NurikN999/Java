import java.util.*;
public class AreaOfHexagon{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = in.nextDouble();

		double area = (6 * Math.pow(side,2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %4.2f\n", area);
	}
}