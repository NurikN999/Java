import java.util.*;
public class CDValue{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double depositAmount = in.nextDouble();
		System.out.print("Enter annual percentage yield: ");
		double percentage = in.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int numberOfMonths = in.nextInt();
		System.out.println("Month \t\t CD Value");
		for(int i = 1; i <= 18; i++){
			depositAmount = depositAmount + (depositAmount * (percentage / 1200));
			System.out.printf("%d \t\t %5.2f",i,depositAmount).println();
		}
	}
}