import java.util.*;

public class Lottery{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter your guess: ");
		int guess = in.nextInt();

		int lottery = (int)(Math.random() * 100);
		int lotteryDigit1 =  lottery / 10;
		int lotteryDigit2 = lottery % 10;

		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lottery);

		if(guess == lottery)
			System.out.println("EXCELLENT! Your award is $10.000");
		else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("GOOD JOB! Your award is $3.000");
		else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2))
			System.out.println("NICE! Your award is $1.000");
	}
}