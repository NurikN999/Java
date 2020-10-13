public class eleven_ex{
	public static void main(String[] args) {
		int secondsForBirth = 7;
		int secondsForDeath = 13;
		int secondsForImmigrant = 45;
		int currentPopulation = 312_032_486;
		int daysInYear = 365;

		int secondsInYear = 60*60*24*365;
		int birhInYear = secondsInYear / secondsForBirth;
		int deathInYear = secondsInYear / secondsForDeath;
		int immigrantsInYear = secondsInYear / secondsForImmigrant;

		for(int i = 0 ; i < 5; i++){
			currentPopulation = (currentPopulation + birhInYear + immigrantsInYear)- deathInYear;
		}

		System.out.println("After 5 years current population in the U.S.A will be " + currentPopulation);
	}
}