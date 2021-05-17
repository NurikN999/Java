interface Base{
    default void show(String txt){
        System.out.println("Message from 'Base' Interface: " + txt);
    }

    void hello();
}

class Alpha implements Base{
    @Override
    public void hello(){
        System.out.println("Object of Alpha class");
    }

    @Override
    public void show(String txt){
        System.out.println("Message from Alpha class: " + txt);
    }
}

class Bravo implements Base{
    @Override
    public void hello(){
        System.out.println("Object of Bravo class");
    }

    @Override
    public void show(String txt){
        System.out.println("Message from Bravo class: " + txt);
    }
}

public class UsingDefaultMethodsApplication{
    public static void main(String[] args){
        Base ref;

        Alpha alpha = new Alpha();
        alpha.hello();
        alpha.show("Hello there, it's ALPHA");
        ref = alpha;
        ref.show("Interface variable REF");

        System.out.println();

        Bravo bravo = new Bravo();
        bravo.hello();
        bravo.show("Hello there, it's BRAVO");
        ref = bravo;
        ref.show("Interface variable REF");
    }
}