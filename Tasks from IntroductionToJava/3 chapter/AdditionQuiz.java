import java.util.*;
public class AdditionQuiz{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		System.out.print("What is " + n1 + " + " + n2 + "?");
		int answer = in.nextInt();
		System.out.println(n1 + " + " + n2 + " = " + answer + " is " + (n1 + n2 == answer));
	}
}