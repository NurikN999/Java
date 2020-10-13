import java.util.*;

public class PerimeterOfTriangle{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int edge1 = in.nextInt();
		int edge2 = in.nextInt();
		int edge3 = in.nextInt();
		int perimeter;

		if((edge1 + edge2 > edge3) || (edge1 + edge3 > edge2) || (edge2 + edge3 > edge1)){
			perimeter = edge1 + edge2 + edge3;
			System.out.println("Perimeter of a triangle is " + perimeter);
		}
		else{
			System.out.println("The input is invalid");
			System.exit(1);
		}

	}
}