interface First{
    default void hello(){
        System.out.println("Method from 'FIRST' Interface");
    }
}

interface Second{
    default void hello(){
        System.out.println("Method from 'SECOND' Interface");
    }
}

class MyClass implements First, Second{
    public void hello(){
        First.super.hello();
        Second.super.hello();
    }
}

public class MoreDefaultMethodsApplication{
    public static void main(String[] args){
        MyClass obj = new MyClass();
        obj.hello();
    }
}