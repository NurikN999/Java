import java.util.*;
public class GCD{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter 2 integers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int gcd = 1;
		for(int i = 1; i <= num1 && i <= num2; i++){
			if(num1 % i == 0 && num2 % i == 0)
				gcd = i;
		}
		System.out.println("Greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
	}
}