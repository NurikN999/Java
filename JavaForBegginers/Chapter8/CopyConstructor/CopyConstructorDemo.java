package Chapter8.CopyConstructor;

//superclass
class Base{

    String name;

    public Base(String name){
        this.name = name;
    }

    //Copy Constructor
    public Base(Base obj){
        this.name = obj.name;
    }
}

class MyClass extends Base{

    int code;
    public MyClass(String name, int code){
        super(name);
        this.code = code;
    }

    public MyClass(MyClass obj){
        super(obj.name);
        this.code = obj.code;
    }

    public void show(){
        System.out.println("'String' field: " + name + 
                         "\n'Integer' field: " + code);
    }
}

public class CopyConstructorDemo {

    public static void main(String[] args) {
        
        MyClass A = new MyClass("Yellow", 200);
        //B object will copy A object fields
        MyClass B = new MyClass(A);
        
        // I changed A object fields
        A.name = "Red";
        A.code = 100;

        //I called constructor, which accept anonimus object with fields
        //"Green" and 300. Because of that, we have Copy Constructor here.
        MyClass C = new MyClass(new MyClass("Green", 300));

        System.out.println("Object A: ");
        A.show();

        System.out.println("Object B: ");
        B.show();

        System.out.println("Object C: ");
        C.show();
    }
    
}
