import java.util.*;
public class CalculatingEnergy{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double waterInKilo = in.nextDouble();

		System.out.print("Enter the initial temperature: ");
		double initialTemp = in.nextDouble();

		System.out.print("Enter the final temperature: ");
		double finalTemp = in.nextDouble();

		double q = waterInKilo * (finalTemp - initialTemp) * 4184;

		System.out.println("The energy needed is " + q);
	}
}