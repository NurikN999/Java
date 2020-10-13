import java.util.*;

public class Game_3_17{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("scissor(0), rock(1) , paper(2): ");
		int n = in.nextInt();

		int computer = (int)(Math.random() * 3);

		System.out.print("The computer is ");
		switch (computer)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (n)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper ");
		}
		if (computer == n)
			System.out.println(" too. It is a draw");
		else
		{
			boolean win = (n == 0 && computer == 2) ||
							  (n == 1 && computer == 0) || 
							  (n == 2 && computer == 1);
			if (win)
				System.out.println(". You won");
			else
				System.out.println(". You lose");
		}
	}
}