import java.util.*;

public class TestConditionalExpressions{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your money: ");
		int money = in.nextInt();

		int percentage = (money > 150_000) ? 15 : 10;

		System.out.println(percentage + "%");
	}
}