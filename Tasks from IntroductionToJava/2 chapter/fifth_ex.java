import java.util.*;
public class fifth_ex{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = in.nextDouble();
		double gratuityRate = in.nextDouble();

		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;

		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}
}