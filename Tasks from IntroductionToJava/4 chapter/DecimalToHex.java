import java.util.*;
public class DecimalToHex{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int decVal = in.nextInt();
		if(decVal >= 0 && decVal <=9){
			System.out.println("The hex value is " + decVal);
		}
		else if (decVal >= 10 && decVal <= 15){
			switch(decVal){
				case 10: System.out.println("The hex value is A");
				break;
				case 11: System.out.println("The hex value is B");
				break;
				case 12: System.out.println("The hex value is C");
				break;
				case 13: System.out.println("The hex value is D");
				break;
				case 14: System.out.println("The hex value is E");
				break;
				case 15: System.out.println("The hex value is F");
			}
		}
		else
			System.out.println(decVal + " is an invalid input");
	}
}