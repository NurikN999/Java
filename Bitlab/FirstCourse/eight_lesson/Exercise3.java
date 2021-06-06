package Bitlab.eight_lesson;

public class Exercise3 {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("Phone","11",368000),
                new Phone("Samsug","S21 Ultra",468000),
                new Phone(),
                new Phone("Iphone", "12",450000),
                new Phone("Nokia","3310",999999)};

        for (int i = 0; i < phones.length; i++) {
            phones[i].getData();
        }
    }
}
