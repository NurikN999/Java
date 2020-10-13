import java.util.*;
public class loan{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		double interestRate = in.nextDouble();


		double monthlyInterestRate = interestRate / 1200;

		System.out.print("Enter number of years as an integer, e.g., 5: ");
		int numberOfYears = in.nextInt();

		System.out.print("Enter loan amount, e.g., 120000.95: ");
		double loanAmount = in.nextDouble();

		double monthlyPayment = (loanAmount * monthlyInterestRate)/(1 - 1/Math.pow(1 + monthlyInterestRate,numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;

		System.out.println("Monthly payment is : $" + (int)(monthlyPayment * 100) /100.0 );
		System.out.println("Total payment is : $" + (int)(totalPayment * 100) / 100.0 );
	}
}