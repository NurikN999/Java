package Chapter8.AnonymousClass;


abstract class Base{

    private String name;

    Base(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Object's name: " + name);
    }

    abstract void hello();

}

public class AnonymousClassDemo {

    public static void main(String[] args) {
        
        Base obj = new Base("Red"){
            void hello(){
                System.out.println("Object of anonymous class");
            }
        };

        obj.show();
        obj.hello();

        new Base("Yellow"){

            void hello(){
                System.out.println("Anonymous object");
            }

            void showAll(){
                hello();
                show();
            }

        }.showAll();

    }
    
}
