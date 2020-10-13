import java.util.*;
public class Lottery5{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d1,d2;
		d1 = (int)(Math.random() * 10);
		do{
		d2 = (int)(Math.random() * 10);
		}while(d1 == d2);
		System.out.print("Enter your guess: ");
		int guess = in.nextInt();
		int g1 = guess / 10;
		int g2 = guess % 10;

		System.out.println("The lottery number is " + d1 + "" + d2);

		if(g1 == d1 && g2 == d2)
			System.out.println("EXCELLENT! Your award is $10.000");
		else if(g2 == d1 && g1 == d2)
			System.out.println("GOOD JOB! Your award is $3.000");
		else if((g1 == d1 || g1 == d2) || (g2 == d1 || g2 == d2))
			System.out.println("NICE! Your award is $1.000");
		else
			System.out.println("Sorry! No match");
	}
}