import java.util.*;
public class FutureTution{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double tution = 10000;
		double percentage = 0.05;
		double sum = 0;
		for(int i = 1; i <= 10; i++){
			tution = tution + (tution * percentage);
		}
		System.out.printf("After 10 years tution of university will be: %5.2f $", tution ).println();
		for(int i = 1; i <= 4; i++){
			tution = tution + (tution * percentage);
			sum += tution;
		}
		System.out.printf("After 10 years and next 4 years cost of university will be: %5.2f $", sum);
	}
}