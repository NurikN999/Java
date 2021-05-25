package Bitlab.second_lesson;

import java.util.*;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int xRook = in.nextInt();
        int yRook = in.nextInt();

        int xOther = in.nextInt();
        int yOther = in.nextInt();

        if(xRook == xOther || yRook == yOther)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
