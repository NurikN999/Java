import java.util.*;
public class CharacterOnASCII{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int n = in.nextInt();
		char ch = (char)n;
		System.out.println("The character for ASCII code " + n + " is " + ch);
	}
}