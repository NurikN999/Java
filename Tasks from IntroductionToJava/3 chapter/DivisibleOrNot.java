import java.util.*;
public class DivisibleOrNot{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = in.nextInt();

		boolean and = (n % 5 == 0) && (n % 6 == 0);
		boolean or = (n % 5 == 0) || (n % 6 == 0);
		boolean xOr = (n % 5 == 0) ^ (n % 6 == 0);

		System.out.println("Is " + n + " divisible by 5 and 6? " + and);
		System.out.println("Is " + n + " divisible by 5 or 6? " + or);
		System.out.println("Is " + n + " divisible by 5 or 6, but not both? " + xOr);
	}
}