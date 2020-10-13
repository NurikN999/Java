import java.util.*;

public class FutureDates{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = in.nextInt();
		String todayDay = "null";

		System.out.print("Enter the number of days elapsed since today: ");
		int numberOfDays = in.nextInt();
		int futureDay = (numberOfDays + today) % 7 ;

		switch(today){
			case 1: todayDay = "Monday";
			break;
			case 2: todayDay = "Tuesday";
			break;
			case 3: todayDay = "Wednesday";
			break;
			case 4: todayDay = "Thursday";
			break;
			case 5: todayDay = "Friday";
			break;
			case 6: todayDay = "Saturday";
			break;
			case 0: todayDay = "Sunday";
		}

		switch(futureDay){
			case 1: System.out.println("Today is " + todayDay + " and the future day is Monday");
			break;
			case 2: System.out.println("Today is " + todayDay + " and the future day is Tuesday");
			break;
			case 3: System.out.println("Today is " + todayDay + " and the future day is Wednesday");
			break;
			case 4: System.out.println("Today is " + todayDay + " and the future day is Thursday");
			break;
			case 5: System.out.println("Today is " + todayDay + " and the future day is Friday");
			break;
			case 6: System.out.println("Today is " + todayDay + " and the future day is Saturday");
			break;
			case 0: System.out.println("Today is " + todayDay + " and the future day is Sunday");
		}
	}
}