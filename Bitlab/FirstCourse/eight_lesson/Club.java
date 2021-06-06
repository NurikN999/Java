package Bitlab.eight_lesson;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player[] players;

    public Club(){
        name = "Some team";
        country = "Some country";
        players = new Player[5];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
        }
    }

    public Club(String name, String country, int ratingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData(){
        System.out.println("************************");
        System.out.println("Name of club: " + name +
                           "\nCountry: " + country +
                           "\nRating points: " + ratingPoints);
        System.out.println("Line-Up of club: ");
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }

        System.out.println("************************" + "\n");
    }
}
