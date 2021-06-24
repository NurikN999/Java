package Chapter9.Generics;

class MyClass<X>{

    X data;

    MyClass(X data){
        this.data = data;
    }

    void show(){
        System.out.println("Result of the field: " + data);
    }

}

public class UsingGenericsDemo {

    public static void main(String[] args) {
        
        MyClass<Integer> A = new MyClass<>(15);
        MyClass<Character> B = new MyClass<>('C');
        MyClass<String> C = new MyClass<>("Some string");

        A.show();
        B.show();
        C.show();

    }
    
}
