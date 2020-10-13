import java.util.*;
public class GuessingNumbers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		int number = (int)(Math.random() * 100);
		System.out.print("Enter a guess: ");
		int guess = in.nextInt();

		while(guess != number){
			if(guess > number){
				System.out.println("You are too high");
				System.out.print("Enter a guess: ");
				guess = in.nextInt();
			}else if(guess < number){
				System.out.println("You are too low");
				System.out.print("Enter a guess: ");
				guess = in.nextInt();
			}
		}
		System.out.println("Yes , the number is " + number);

	}
}