package Bitlab.tenth_lesson;

public class Burger extends Food {
    //1,2 or 3
    int meatAmount;

    /*
    1 - Говядина
    2 - Курица
     */
    int meatType;

    public Burger(){
        meatAmount = 1;
        meatType = 2;
    }

    public Burger(int meatAmount, int meatType) {
        this.meatAmount = meatAmount;
        this.meatType = meatType;
    }

    @Override
    public double getCalories() {
        if (meatType == 1)
            return (double) meatAmount * 840;
        else if (meatType == 2)
            return (double) meatAmount * 560;

        return 0;
    }

}
