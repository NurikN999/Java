import java.util.*;
public class CostOfDriving{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double drivingDistance = in.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = in.nextDouble();

		System.out.print("Enter price per gallon: ");
		double pricePerGallon = in.nextDouble();

		double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
		System.out.println("The cost of driving is $" + costOfDriving);
	}
}