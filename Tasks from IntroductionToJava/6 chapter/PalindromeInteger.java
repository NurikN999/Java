import java.util.*;
public class PalindromeInteger{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num + (isPalindrome(num)? " is palindrome":" is not palindrome"));
    }
    public static boolean isPalindrome(int reverse){
        if(reverse == reverse(reverse))
            return true;
        else
            return false;
    }
    public static int reverse(int n){
        String reverse = "";
        String s = n + "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            reverse += s.charAt(i);
        }
        return Integer.parseInt(reverse);
    }
}