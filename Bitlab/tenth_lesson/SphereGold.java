package Bitlab.tenth_lesson;

public class SphereGold extends GoldShape{
    double radius;

    public SphereGold(){
        radius = 1;
    }
    public SphereGold(double radius) {
        this.radius = radius;
    }

    @Override
    double getVolume() {
        return (double) 4/3 * Math.PI * Math.pow(radius,3);
    }

}
