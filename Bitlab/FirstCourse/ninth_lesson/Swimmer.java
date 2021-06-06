package Bitlab.ninth_lesson;

public class Swimmer extends Sportsman{
    String style;
    double recordTime;

    public Swimmer() {
        style = "unknown";
        recordTime = 0;
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    @Override
    public void play(){
        super.play();
        System.out.println("Style of swim: " + style +
                        "\nRecord time: " + recordTime);
        System.out.println("Swimming");
    }
}
