import java.util.*;

interface MyInterface{
    int NUMBER = 100;
    char getSymbol(int number);
    double getNumber(double x);
}

class Test implements MyInterface{
    @Override
    public char getSymbol(int number){
        return (char)number;
    }
    @Override
    public double getNumber(double x){
        return x;
    }
}

public class UsingInterfaceApplication{
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.getSymbol(65));
        System.out.println(t.getNumber(35.02));
    }
}