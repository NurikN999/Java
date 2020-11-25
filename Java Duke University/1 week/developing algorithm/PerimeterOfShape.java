import java.util.*;
public class PerimeterOfShape{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter coordinates of a: ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.print("Enter coordinates of b: ");
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		System.out.print("Enter coordinates of c: ");
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		System.out.print("Enter coordinates of d: ");
		int x4 = in.nextInt();
		int y4 = in.nextInt();
		double ab = distance(x1,y1,x2,y2);
		double bc = distance(x2,y2,x3,y3);
		double cd = distance(x3,y3,x4,y4);
		double da = distance(x4,y4,x1,y2);
		System.out.println(ab + " " + bc + " " + cd + " " + da);
		System.out.println("Perimeter of your shape is: " + perimeter(ab,bc,cd,da));
	}

	public static double distance(int x1, int y1, int x2, int y2){
		double coordinates = (Math.pow((x2 - x1),2)) + (int)(Math.pow((y2 - y1),2));
		return (Math.pow(coordinates,0.5));
	}
	public static double perimeter(double a, double b, double c, double d){
		return a+b+c+d;
	}
}