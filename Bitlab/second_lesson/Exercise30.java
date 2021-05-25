package Bitlab.second_lesson;

import java.util.*;
public class Exercise30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your branch: ");
        System.out.println("1 - Science \n2 - Humanitarian subjects \n3 - Art \n4 - Sport");
        int choose = in.nextInt();
        switch(choose){
            case 1:
                System.out.println("1 - Math \n2 - Physics");
                int scienceChoose = in.nextInt();
                if(scienceChoose == 1)
                    System.out.println("You are Financier");
                else
                    System.out.println("You are Engineer");
                break;

            case 2:
                System.out.println("1- History \n2 - Foreign Languages");
                int humanitarianChoose = in.nextInt();
                if(humanitarianChoose == 1)
                    System.out.println("You are Historic or Diplomat");
                else
                    System.out.println("You are Translator");
                break;

            case 3:
                System.out.println("1 - Drawing \n2 - Singing");
                int artChoose = in.nextInt();
                if(artChoose == 1)
                    System.out.println("You are Painter or Architect");
                else
                    System.out.println("You are Singer or Tamada");
                break;

            case 4:
                System.out.println("1 - Team \n2 - Individual");
                int sportChoose = in.nextInt();
                if(sportChoose == 1)
                    System.out.println("You are footballer or Basketball player");
                else
                    System.out.println("You are boxer or tennis player");
        }
    }
}
