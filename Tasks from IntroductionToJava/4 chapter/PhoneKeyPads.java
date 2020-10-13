import java.util.*;
public class PhoneKeyPads{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String s = in.nextLine();
		char ch = s.charAt(0);
		if(ch>= 'a' && ch <= 'c' || ch >= 'A' && ch <= 'C')
			System.out.println("The corresponding number is 2");
		else if(ch>= 'd' && ch <= 'f' || ch >= 'D' && ch <= 'F')
			System.out.println("The corresponding number is 3");
		else if(ch>= 'g' && ch <= 'i' || ch >= 'G' && ch <= 'I')
			System.out.println("The corresponding number is 4");
		else if(ch>= 'j' && ch <= 'l' || ch >= 'J' && ch <= 'L')
			System.out.println("The corresponding number is 5");
		else if(ch>= 'm' && ch <= 'o' || ch >= 'M' && ch <= 'O')
			System.out.println("The corresponding number is 6");
		else if(ch>= 'p' && ch <= 's' || ch >= 'P' && ch <= 'S')
			System.out.println("The corresponding number is 7");
		else if(ch>= 't' && ch <= 'v' || ch >= 'T' && ch <= 'V')
			System.out.println("The corresponding number is 8");
		else if(ch>= 'w' && ch <= 'z' || ch >= 'W' && ch <= 'Z')
			System.out.println("The corresponding number is 9");
		else
			System.out.println(ch + " is an invalid input");
	}
}