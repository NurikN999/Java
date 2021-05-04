import java.util.*;
public class Listing6ex8{
    public static void main(String[] args){
        Alpha a = new Alpha("Alpha");
        a.show();
        System.out.println("------------------");
        Bravo b = new Bravo("Bravo");
        b.show();
    }
}

class Alpha{
    String name;

    void objectCreated(){
        System.out.println("Created object of Alpha class.");
    }

    void hello(){
        System.out.println("Object of Aplha class.");
    }

    void show(){
        hello();
        System.out.println("Field with name: " + name);
    }

    public Alpha(String name){
        objectCreated();
        this.name = name;
    }

}

class Bravo extends Alpha{
    @Override
    void objectCreated(){
        System.out.println("Created object of Bravo class.");
    }

    @Override
    void hello(){
        System.out.println("Object of Bravo class.");
    }

    public Bravo(String name){
        super(name);
    }
}