package Bitlab.tenth_lesson;

public class Coke extends Food {
    double volumeLiters;
    boolean isSparking;

    public Coke(){
        volumeLiters = 0.5;
        isSparking = true;
    }
    public Coke(double volumeLiters, boolean isSparking) {
        this.volumeLiters = volumeLiters;
        this.isSparking = isSparking;
    }

    @Override
    public double getCalories() {
        if (isSparking)
            return volumeLiters * 400;
        return volumeLiters * 100;
    }

}
