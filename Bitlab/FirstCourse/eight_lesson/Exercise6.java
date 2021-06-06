package Bitlab.eight_lesson;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isStop = false;
        Student[] students = new Student[10000];
        int size = 0;
        int id = 1;
        while(!isStop){
            System.out.println("PRESS [1] TO ADD STUDENT" +
                               "\nPRESS [2] TO LIST STUDENT" +
                               "\nPRESS [0] TO EXIT");

            byte choice = in.nextByte();

            if(choice == 1){
                System.out.println("Insert name? ");
                String name = in.next();
                System.out.println("Insert surname? ");
                String surname = in.next();
                System.out.println("Insert GPA? ");
                double gpa = in.nextDouble();

                students[size] = new Student(id,name,surname,gpa);
                size++;
                id++;
            }
            else if(choice == 2){
                for (int i = 0; i < size; i++) {
                    System.out.println(students[i].getStudentData());
                    System.out.println("*************************");
                }
            }
            else if(choice == 0)
                isStop = true;
            else{
                System.out.println("Enter 1,2 or 3!");
                System.out.println();
            }
        }
    }
}
