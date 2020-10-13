import java.util.*;
public class KiloToPounds{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double pounds = 2.2;
		System.out.println("Kilogrmas \t\t Pounds");
		for(int i = 1; i < 200; i++){
			if(i % 2 !=0)
			System.out.printf("%d \t\t\t %3.1f" , i , i*pounds).println();
		}
	}
}