package Chapter9.Generics;


class Alpha<X>{

    private X first;

    Alpha(X first){
        set(first);
    }

    void set(X first){
        this.first = first;
    }

    X get(){
        return first;
    }


}

class Bravo<X,Y>{

    Alpha<X> obj;
    Y second;

    Bravo(X first, Y second){

        obj = new Alpha<X>(first);
        this.second = second;

    }

    void show(){
        System.out.println("Result: " + obj.get() + " and " + second);
    }

}

public class GenericClassWithSeveralParameters {

    public static void main(String[] args) {
        
        Bravo<Integer, Character> A = new Bravo<>(100, 'A');
        A.show();

        Bravo<String, Double> B = new Bravo<>("BRAVO", 12.123);
        B.show();

    }
    
}
