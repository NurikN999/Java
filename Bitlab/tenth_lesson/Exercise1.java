package Bitlab.tenth_lesson;

public class Exercise1 {
    public static void main(String[] args) {
        Chocolate snickers = new Chocolate(120);
        Chocolate twix = new Chocolate(150);

        Burger burgerKing = new Burger(2, 2);
        Burger mcDonalds = new Burger(1, 1);

        Coke cocaCola = new Coke(0.5, true);
        Coke fuseTea = new Coke(0.5, false);

        Food[] foods = {snickers, twix, burgerKing, mcDonalds, cocaCola, fuseTea};

        for (Food food : foods) {
            System.out.println(food.getCalories());
        }
    }
}
