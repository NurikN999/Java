import java.util.*;
public class CompoundValue{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		int monthlyAmount = in.nextInt();

		double annualInterestRate = 5.0 / 100;

		double monthlyInterestRate = 0.05 / 12;

		double valueOfAccount = monthlyAmount * (1 + monthlyInterestRate);
		double secondMonth = (monthlyAmount + valueOfAccount) * (1 + monthlyInterestRate);
		double thirdMonth = (monthlyAmount + secondMonth) * (1 + monthlyInterestRate);
		double fourthMonth = (monthlyAmount + thirdMonth) * (1 + monthlyInterestRate);
		double fifthMonth = (monthlyAmount + fourthMonth) * (1 + monthlyInterestRate);
		double sixthMonth = (monthlyAmount + fifthMonth) * (1 + monthlyInterestRate);
		System.out.println("After the sixth month, the account value is " + sixthMonth);
	}
}