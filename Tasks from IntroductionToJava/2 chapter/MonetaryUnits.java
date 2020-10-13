import java.util.*;
public class MonetaryUnits{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter amount of your money: ");
		int money = in.nextInt();

		int dollars = money / 100;
		int cents = money % 100;

		System.out.println("Your " + money + " money consist of: ");
		System.out.println(dollars + " dollars");
		System.out.println(cents + " cents");
	}
}