import java.util.*;
public class PopulationProject{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int n = in.nextInt();

		int secondsForBirth = 7;
		int secondsForDeath = 13;
		int secondsForImmigrant = 45;
		int currentPopulation = 312_032_486;
		int daysInYear = 365;

		int secondsInYear = 60*60*24*365;
		int birhInYear = secondsInYear / secondsForBirth;
		int deathInYear = secondsInYear / secondsForDeath;
		int immigrantsInYear = secondsInYear / secondsForImmigrant;

		for(int i = 0 ; i < n; i++){
			currentPopulation = (currentPopulation + birhInYear + immigrantsInYear)- deathInYear;
		}

		System.out.println("The population in " + n + " years is " + currentPopulation);
	}
}