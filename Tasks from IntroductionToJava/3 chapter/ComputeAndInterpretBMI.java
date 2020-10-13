import java.util.*;
public class ComputeAndInterpretBMI{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = in.nextDouble();
		System.out.print("Enter height in inches: ");
		double heightInInches = in.nextDouble();

		double weightInKilo = weightInPounds * 0.45359237;
		double heightInMeters = heightInInches * 0.0254;


		double BMI = (weightInKilo) / (Math.pow(heightInMeters , 2));

		if(BMI < 18.5)
			System.out.println("Underweight");
		else if (BMI >= 18.5 && BMI < 25.0)
			System.out.println("Normal");
		else if(BMI >= 25.0 && BMI < 30)
			System.out.println("Overweight");
		else if (BMI >= 30)
			System.out.println("Obese");
	}
}