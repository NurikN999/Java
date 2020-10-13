import java.util.*;
public class MilesToKilometers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Miles \t\t Kilometers");
		double mile = 1.609;
		for(int i = 1; i <= 10; i++)
			System.out.printf("%d \t\t %2.3f" , i , i * mile).println();
	}
}