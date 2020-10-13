import java.util.*;
public class SumOfNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a numbers while number is not equal to 0: ");
		int n = in.nextInt();
		int sum = 0;
		sum += n;
		while(n != 0){
			n = in.nextInt();
			sum += n;
		}
		System.out.println(sum);
	}
}