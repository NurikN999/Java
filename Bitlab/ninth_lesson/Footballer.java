package Bitlab.ninth_lesson;

public class Footballer extends Sportsman{
    String position;
    String club;


    public Footballer() {
        position = "Forward";
        club = "unknown";
    }

    public Footballer(String fullName, int age, String country, String position, String club) {
        super(fullName, age, country);
        this.position = position;
        this.club = club;
    }

    @Override
    public void play(){
        super.play();
        System.out.println("Position: " + position +
                           "\nClub: " + club);
        System.out.println("Playing football");
    }
}
