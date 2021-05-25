package Bitlab.ninth_lesson;

public class MainForOlympicGames {
    public static void main(String[] args) {
        Sportsman list[] = {new Gymnast(),
                new Gymnast("Alexander Alexandr",29,"Russia",189,75,"Light-weight"),
                new Gymnast("Jackson Smith",25,"USA",186,72,"Light-weight"),
                new Footballer(),
                new Footballer("Lionel Messi",33,"Argentina","Forward","Barcelona"),
                new Footballer("Cristiano Ronaldo",36,"Portugal","Forward","Juventus"),
                new Swimmer(),
                new Swimmer("Julian Ariando",34,"Spain","Butterfly",3.15),
                new Swimmer("Sergey Semak",24,"Russia","Breaststroke",3.34)};
        OlympicGames games = new OlympicGames("Tokyo",2020,list);
        for (int i = 0; i < games.sportsmanList.length; i++) {
            games.sportsmanList[i].play();
        }
    }
}
