import java.util.*;
public class PentagonalNumbers{
    public static void main(String[] args) {
        final int NUMBER_PER_PENTAGONAL = 100;
        final int NUMBER_PER_LINE = 10;
        for (int i = 1; i <=NUMBER_PER_PENTAGONAL ; i++) {
            if(i % NUMBER_PER_LINE == 0)
                System.out.printf("%7d\n",getPentagonalNumber(i));
            else
                System.out.printf("%7d",getPentagonalNumber(i));
        }
    }
    public static int getPentagonalNumber(int n){
        return (n * (3*n - 1) / 2);
    }
}