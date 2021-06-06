package Bitlab.fifth_lesson;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1 - Введите слово
        String str = in.next();
        // Вы создали счетчик гласных букв.
        int countOfGlasniye = 0;

        // Вы создали цикл и проходите по нему до того момента, пока не достигнете длины строки
        // example: Tesla = 5
        for (int i = 0; i < str.length(); i++) {
            // Тут стоит условие, если символ на i-том индексе == 'a' или 'e' или 'o' и т.д
            // Тогда выполни условие
            if(str.charAt(i) == 'E' || str.charAt(i) == 'A' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
                // Увеличивай счетчик гласных на единицу
                countOfGlasniye += 1;
            //Если условие не верно, то просто иди дальше
            else
                continue;
        }

        System.out.println(countOfGlasniye);
    }
}
