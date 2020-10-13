import java.util.*;
public class KTPPTK{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pounds = 2.2;
		System.out.println("Kilograms \t Pounds \t | \t\t Pounds \t Kilograms");
		for(int i = 1; i < 200; i++){
			for(int j = 20; j < 516; j++){
				if(i % 2 != 0 && j % 5 == 0)
				System.out.printf("%d \t %3.1f \t | \t\t %d \t %3.2f", i , i * pounds, j , j / pounds).println();
			}
		}
	}
}