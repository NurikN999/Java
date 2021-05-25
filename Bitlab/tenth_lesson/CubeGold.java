package Bitlab.tenth_lesson;

public class CubeGold extends GoldShape{
    double side;

    public CubeGold(){
        side = 1;
    }

    public CubeGold(double side) {
        this.side = side;
    }

    @Override
    double getVolume() {
        return Math.pow(side,3);
    }
}
