import java.util.*;
public class PalindromeWithLoop{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = in.nextLine();

		int low = 0;
		int high = s.length() - 1;
		boolean isPolindrome = true;
		while(low < high){
			if(s.charAt(low) != s.charAt(high)){
				isPolindrome = false;
				break;
			}
			low++;
			high--;
		}

		if(isPolindrome)
			System.out.println(s + " is a palindrome");
		else
			System.out.println(s + " is not a palindrome");
	}
}