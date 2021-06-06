package Bitlab.ninth_lesson;

public class Gymnast extends Sportsman{
    int height;
    int weight;
    String style;

    public Gymnast() {
        height = 0;
        weight = 0;
        style = "unknown";
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    @Override
    public void play(){
        super.play();
        System.out.println("Height: " + height +
                "\nWeight: " + weight +
                "\nStyle: " + style);
        System.out.println("Gymnastics");
    }
}
