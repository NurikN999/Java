import java.util.*;
public class Palindrome{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a three-digit integer: ");
		int number = in.nextInt();
		int d1 = number / 100;
		int d3 = number % 100 % 10;
		if(d1 == d3)
			System.out.println(number + " is a palindrome");
		else
			System.out.println(number + " is not a palindrome");
	}
}