import java.util.*;
public class UnicodeOfCharacter{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = in.nextLine();
		char ch = s.charAt(0);
		System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}
}