package Bitlab.eight_lesson;

public class Exercise7 {
    public static void main(String[] args) {
        Player[] players1 = {new Player(10, "Lionel", "Messi", "Forward"),
                new Player(11, "Ousmane", "Dembele", "Forward"),
                new Player(8, "Andres", "Iniesta", "Midfielder"),
                new Player(3, "Gerard", "Pique", "Defender"),
                new Player(1, "Marc-Andre", "Ter-Stegen", "Goalkeeper")};

        Player[] players2 = {new Player(7, "Cristiano", "Ronaldo", "Forward"),
                new Player(11, "Gareth", "Bale", "Forward"),
                new Player(8, "Toni", "Kroos", "Midfielder"),
                new Player(4, "Sergio", "Ramos", "Defender"),
                new Player(1, "Thibaut", "Courtois", "Goalkeeper")};

        Club Barcelona = new Club("Barcelona", "Spain", 76, players1);
        Club RealMadrid = new Club("Real Madrid", "Spain", 78, players2);

        Club[] laLiga = {Barcelona, RealMadrid};

        for (Club club : laLiga) {
            club.printClubData();
        }
    }
}
