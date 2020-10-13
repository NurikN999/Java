import java.util.*;
public class CurrencyExchange{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = in.nextDouble();

		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = in.nextInt();

		int rmbAmount;
		int dollarAmount;
		if(choice != 0 ){
			System.out.print("Enter the RMB amount: ");
			rmbAmount = in.nextInt();
			System.out.println(rmbAmount + " yan is $" + (rmbAmount / exchangeRate));
		}
		else{
			System.out.print("Enter the dollar amount: ");
			dollarAmount = in.nextInt();
			System.out.println(dollarAmount + " dollars is " + (dollarAmount * exchangeRate) + " yan");
		}
	}
}