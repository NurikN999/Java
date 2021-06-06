package Bitlab.tenth_lesson;

public class Chocolate extends Food {
    int weight;

    public Chocolate(){
        weight = 0;
    }
    public Chocolate(int weight) {
        this.weight = weight;
    }

    @Override
    public double getCalories() {
        return (double) weight * 740;
    }
}
