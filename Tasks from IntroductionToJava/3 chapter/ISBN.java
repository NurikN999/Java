import java.util.*;

public class ISBN{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int number = in.nextInt();

		int d1 = number / 100_000_000;
		int remainingDigits = number % 100_000_000;

		int d2 = remainingDigits / 10_000_000;
		remainingDigits = remainingDigits % 10_000_000;

		int d3 = remainingDigits / 1_000_000;
		remainingDigits %= 1_000_000;

		int d4 = remainingDigits / 100_000;
		remainingDigits %= 100_000;

		int d5 = remainingDigits / 10_000;
		remainingDigits %= 10_000;

		int d6 = remainingDigits / 1000;
		remainingDigits %= 1000;

		int d7 = remainingDigits / 100;
		remainingDigits %= 100;

		int d8 = remainingDigits / 10;
		remainingDigits %= 10;

		int d9 = remainingDigits;

		int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

		if(d10 == 10)
			System.out.println("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "X" );
		else
			System.out.println("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10 );
	}
}