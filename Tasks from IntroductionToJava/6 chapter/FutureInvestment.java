import java.util.*;
public class FutreInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("The amount investment: ");
        double amount = in.nextDouble();
        System.out.print("Interest rate: ");
        double interestRate = in.nextDouble();
        double monthlyRate = (interestRate / 100) / 12;
        System.out.print("Enter years: ");
        int year = in.nextInt();
        for (int i = 1; i <= year; i++) {
            System.out.printf("%11.2f", futureInvestment(amount, monthlyRate, i));
        }
    }

    public static double futureInvestment(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}