package Bitlab.second_lesson;

import java.util.*;
public class Exercise29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double USD = 420;
        final double EUR = 510;
        final double RUB = 5.8;

        System.out.println("Insert amount in KZT: ");
        int amount = in.nextInt();

        System.out.println("Choose currency:" +
                           "\n[1] USD" +
                           "\n[2] EUR" +
                           "\n[3] RUB");
        int choose = in.nextInt();

        switch(choose){
            case 1:
                System.out.printf("%5.2f USD",(amount / USD)).println();
                break;
            case 2:
                System.out.printf("%5.2f EUR",(amount / EUR)).println();
                break;
            case 3:
                System.out.printf("%5.2f RUB",(amount / RUB)).println();
        }
    }
}
