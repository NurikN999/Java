import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverse(n));
        System.out.println(isPalindrome(n,reverse(n)));
    }
    public static int reverse(int n){
        int reverse = 0;
        while (n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int n, int reverse){
        boolean isPalindrome = false;
        if(n == reverse)
            isPalindrome = true;
        else
            isPalindrome = false;
        return  isPalindrome;
    }
}
