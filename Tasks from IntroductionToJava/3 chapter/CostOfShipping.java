import java.util.*;

public class CostOfShipping{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter weight of your package: ");
		int weight = in.nextInt();
		double costPerPound = 0;

		if(weight > 50)
			System.out.println("The package cannot be shipped.");
		else{
			if(weight>0 && weight <= 1)
				costPerPound = 3.5;
			else if(weight > 1 && weight <= 3)
				costPerPound = 5.5;
			else if(weight > 3 && weight <= 10)
				costPerPound = 8.5;
			else if(weight > 10 && weight <= 20)
				costPerPound = 10.5;
		}

		System.out.println("Cost of shipping your package is $" + (weight * costPerPound));
	}
}