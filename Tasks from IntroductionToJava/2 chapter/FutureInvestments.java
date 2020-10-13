import java.util.*;
public class FutureInvestments{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double investmentAmount = in.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterest = in.nextDouble();
		double monthlyInterest = (annualInterest / 100) / 12;

		System.out.print("Enter number of years: ");
		int numberOfYear = in.nextInt();

		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterest), numberOfYear * 12);
		System.out.println("Accumulated value is " + futureInvestmentValue);
	}
}