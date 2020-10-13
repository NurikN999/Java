import java.util.*;
public class GeometryPosition{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter three points for p0, p1 and p2: ");
		double x0 = in.nextDouble();
		double y0 = in.nextDouble();

		double x1 = in.nextDouble();
		double y1 = in.nextDouble();

		double x2 = in.nextDouble();
		double y2 = in.nextDouble();

		if((x1-x0) * (y2-y0) - (x2-x0) * (y1-y0) > 0){
			System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
		else if ((x1-x0) * (y2-y0) - (x2-x0) * (y1-y0) == 0){
			System.out.println("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
		else if ((x1-x0) * (y2-y0) - (x2-x0) * (y1-y0) < 0){
			System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		}
	}
}