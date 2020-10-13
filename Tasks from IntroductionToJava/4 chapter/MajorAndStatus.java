import java.util.*;
public class MajorAndStatus{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String s = in.nextLine();
		char major = s.charAt(0);
		char status = s.charAt(1);
		String m = "";
		String st = "";

		switch(major){
			case 'M': m = "Mathematics";
			break;
			case 'C': m ="Computer Science ";
			break;
			case 'I': m = "Information Technology ";
		}

		switch(status){
			case '1': st = "Freshman";
			break;
			case '2': st = "Sophomore";
			break;
			case '3': st = "Junior";
			break;
			case '4': st = "Senior";
		}
		System.out.println(m + " " + st);
	}
}