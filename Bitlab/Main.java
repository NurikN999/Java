package Bitlab;

import java.math.BigInteger;
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        boolean flag = false;
        int i = 0;
        BigInteger m = BigInteger.ZERO;
        m = n.divide(BigInteger.valueOf(2));

        if(n.equals(0) || n.equals(1))
            flag = true;
        else{
            for (i = 2; i <= m.intValue(); i++) {
                if(n.divideAndRemainder(BigInteger.valueOf(i)).equals(0)) {
                    flag = true;
                    break;
                }
            }
        }

        if(flag == false)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}