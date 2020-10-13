import java.util.*;
public class Test{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int positive = 0;
		int negative = 0;
		int count = 0;
		double total = 0;

		System.out.println("Enter an integer, the input ends if it is 0: ");
		int n = in.nextInt();

		if(n == 0){
			System.out.println("Program stops when number is 0");
			System.exit(1);
		}

		while(n != 0){
			if(n > 0)
				positive++;
			else
				negative++;
			total += n;
			count++;
			n = in.nextInt();
		}

		double average = total / count;
		System.out.println(
			"The number of positive is " + positive +
			"\nThe number of negatives is " + negative +
			"\nThe total is total " + total +
			"\nThe average is " + average);
	}
}