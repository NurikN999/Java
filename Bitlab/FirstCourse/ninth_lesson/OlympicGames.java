package Bitlab.ninth_lesson;

public class OlympicGames {
    String city;
    int year;
    Sportsman sportsmanList[];

    public OlympicGames(){
        city = "unknown";
        year = 0;
        sportsmanList = null;
    }

    public OlympicGames(String city, int year, Sportsman[] sportsmanList) {
        this.city = city;
        this.year = year;
        this.sportsmanList = sportsmanList;
    }
}
