import java.util.*;
public class CurrentTimeEx{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int timeZone = in.nextInt();

		long millis = System.currentTimeMillis();
		long totalSeconds = millis / 1000;
		long currentSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes %60;

		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;

		long currentHourWithTimeZone = currentHour + timeZone;

		System.out.println("The current time is " + currentHourWithTimeZone + ":" + currentMinutes + ":" + currentSeconds);
	}
}