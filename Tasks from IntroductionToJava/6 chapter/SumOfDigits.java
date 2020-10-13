import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(sumOfDigits(n));
    }
    public static long sumOfDigits(long n){
        long result = 0;
        while(n != 0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
