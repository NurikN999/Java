import java.util.*;
public class SumOfDigits{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = in.nextShort();

		int d1 = (number / 10) / 10;
		int d2 = (number / 10) % 10;
		int d3 = number % 10;

		int sum = d1 + d2 + d3;

		System.out.println("The sum of the digits is " + sum);
	}
}