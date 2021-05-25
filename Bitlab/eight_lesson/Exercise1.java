package Bitlab.eight_lesson;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Phone iphone = new Phone("Phone","11",368000);
        Phone samsung = new Phone("Samsug","S21 Ultra",468000);
        Phone zhaiPhone = new Phone();
        Phone iphone12 = new Phone("Iphone", "12",450000);
        Phone nokia = new Phone("Nokia","3310",999999);
        iphone.getData();
        samsung.getData();
        zhaiPhone.getData();
        iphone12.getData();
        nokia.getData();
    }
}
