import java.util.*;
public class ComputeChange{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an amount of money(in double e.g 4.3): ");
		double amount = in.nextDouble();
		int remainingAmount = (int)(amount * 100);

		int dollars = remainingAmount / 100;
		int remainngCents = remainingAmount % 100;

		int quarters = remainngCents / 25;
		remainngCents = remainngCents % 25;

		int dimes = remainngCents / 10;
		remainngCents = remainngCents % 10;

		int nickels = remainngCents / 5;
		remainngCents %= 5;

		int pennies = remainngCents;

		if(dollars <= 1 && quarters <= 1 && dimes <= 1 && nickels <= 1 && pennies <= 1){
			System.out.println("Your amount " + amount + " consist of ");
			System.out.println(dollars + " dollar");
			System.out.println(quarters + " quarter");
			System.out.println(dimes + " dime");
			System.out.println(nickels + " nickel");
			System.out.println(pennies + " penny");
		}
		else{
			System.out.println("Your amount " + amount + " consist of ");
			System.out.println(dollars + " dollars");
			System.out.println(quarters + " quarters");
			System.out.println(dimes + " dimes");
			System.out.println(nickels + " nickels");
			System.out.println(pennies + " pennies");
		}
	}
}