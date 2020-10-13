import java.util.*;
public class BodyMassIndex{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = in.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInInches = in.nextDouble();

		double weightInKilo = weightInPounds * 0.45359237;
		double heightInMeters = heightInInches * 0.0254;


		double BMI = (weightInKilo) / (Math.pow(heightInMeters , 2));

		System.out.println("BMI is " + BMI);
	}
}