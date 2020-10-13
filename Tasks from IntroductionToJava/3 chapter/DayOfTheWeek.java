import java.util.*;
public class DayOfTheWeek{
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter year: (e.g., 2012): ");
    	int year = in.nextInt();
    	System.out.print("Enter month:1-12: ");
    	int month = in.nextInt();
    	System.out.print("Enter day of the month: 1 - 31: ");
    	int q = in.nextInt();

    	int m = 0;

    	switch(month){
    		case 1: m = 13; year--;
    		break;
    		case 2: m = 14; year--;
    		break;
    		case 3: m = 3;
    		break;
    		case 4: m = 4;
    		break;
    		case 5: m = 5;
    		break;
    		case 6: m = 6;
    		break;
    		case 7: m = 7;
    		break;
    		case 8: m = 8;
    		break;
    		case 9: m = 9;
    		break;
    		case 10: m = 10;
    		break;
    		case 11: m = 11;
    		break;
    		case 12: m = 12;
    	}

    	//j - century
    	int j = year / 100;

    	//k - year of the century
    	int k = year % 100;

    	int h = (q + (int)((26*(m+1)) / 10) + k + (int)(k/4) + (int)(j/4) + 5*j) % 7;
    	switch(h){
			case 2: System.out.println("Day of the week is Monday");
			break;
			case 3: System.out.println("Day of the week is Tuesday");
			break;
			case 4: System.out.println("Day of the week is Wednesday");
			break;
			case 5: System.out.println("Day of the week is Thursday");
			break;
			case 6: System.out.println("Day of the week is Friday");
			break;
			case 0: System.out.println("Day of the week is Saturday");
			break;
			case 1: System.out.println("Day of the week is Sunday");
		}
    }
}