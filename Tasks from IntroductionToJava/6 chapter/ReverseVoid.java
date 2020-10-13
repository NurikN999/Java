import java.util.Scanner;

public class ReverseVoid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        reverse(n);
    }
    public static void reverse(int n){
        while(n != 0){
            System.out.print(n % 10);
            n = n / 10;
        }
    }
}
