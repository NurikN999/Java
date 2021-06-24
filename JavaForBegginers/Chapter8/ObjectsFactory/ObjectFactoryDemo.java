package Chapter8.ObjectsFactory;


abstract class AbstractClass{
    abstract void show();
}

class AlphaOne extends AbstractClass{
    void show(){
        System.out.println("Object of 'ALPHA' class");
    }
}

class BravoOne extends AbstractClass{
    void show(){
        System.out.println("Object of 'BRAVO' class");
    }
}

class Third extends AbstractClass{
    void show(){
        System.out.println("Object of 'CHARLIE' class");
    }
}

public class ObjectFactoryDemo{

    static AbstractClass createObj(int n){

        if(n == 1) return new AlphaOne();
        if(n == 2) return new BravoOne();

        return new Third();

    }
    public static void main(String[] args) {
        
        AbstractClass obj;

        for (int i = 1; i <= 3; i++) {
            obj = createObj(i);
            obj.show();
            System.out.println();    
        }
    }
}