import java.util.*;
public class ConvertLetterGrade{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String s = in.nextLine();
		char ch = s.charAt(0);
		if(ch == 'A' || ch == 'B' || ch == 'C' || ch =='D' || ch =='F'){
			switch(ch){
				case 'A': System.out.println("The numeric value for grade " + ch + " is 4");
				break;
				case 'B': System.out.println("The numeric value for grade " + ch + " is 3");
				break;
				case 'C': System.out.println("The numeric value for grade " + ch + " is 2");
				break;
				case 'D': System.out.println("The numeric value for grade " + ch + " is 1");
				break;
				case 'F': System.out.println("The numeric value for grade " + ch + " is 0");
			}
		}
	}
}