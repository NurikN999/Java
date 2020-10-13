import java.util.*;
public class Payroll{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = in.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = in.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPay = in.nextDouble();
		System.out.print("Enter federal tax withholding rate: "); 
		double federalTax = in.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = in.nextDouble();

		double grossPay = hourlyPay * hours;
		System.out.println("Employee Name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay Rate: " + hourlyPay);
		System.out.println("Gross Pay: " + grossPay);
		System.out.println("Deductions: \n\tFederal withholding (" + federalTax * 100 + "): " + grossPay * federalTax + "\n\tState withholding (" + stateTax * 100 + "%): " + grossPay * stateTax + "\n\tTotal Deduction: " + ((grossPay * federalTax) + (grossPay * stateTax)));
		System.out.println("Net Pay: " + ((grossPay) - ((grossPay * federalTax) + (grossPay * stateTax))));
	}
}