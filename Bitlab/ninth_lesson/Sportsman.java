package Bitlab.ninth_lesson;

public class Sportsman {
    String fullName;
    int age;
    String country;

    public Sportsman() {
        fullName = "unknown";
        age = 0;
        country = "unknown";
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public void play(){
        System.out.println("Full name: " + fullName +
                        "\nAge: " + age +
                        "\nCountry: " + country);
    }
}
