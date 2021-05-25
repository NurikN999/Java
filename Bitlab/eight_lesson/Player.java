package Bitlab.eight_lesson;

public class Player {
    int number;
    String name;
    String surname;
    String position;

    public Player(){
        number = 1;
        name = "unknown";
        surname = "unknown";
        position = "forward";
    }

    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    public String toString(){
        return "Name: " + name +
                "\nSurname: " + surname +
                "\nNumber: " + number +
                "\nPosition: " + position;
    }
}
