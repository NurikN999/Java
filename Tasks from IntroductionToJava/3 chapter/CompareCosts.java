import java.util.*;
public class CompareCosts{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double weight1 = in.nextDouble();
		double price1 = in.nextDouble();

		System.out.print("Enter weight and price for package 2: ");
		double weight2 = in.nextDouble();
		double price2 = in.nextDouble();

		if(weight1 / price1 > weight2 / price2){
			System.out.println("Package 1 has a better price.");
		}
		else if (weight2 / price2 > weight1 / price1){
			System.out.println("Package 2 has a better price.");
		}
		else
			System.out.println("Two packages have the same price");
	}
}