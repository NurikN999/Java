import java.util.*;
public class NumberOfYears{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = in.nextInt();
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440; 
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}