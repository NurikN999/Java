package Chapter8.AnonymousClass;

interface Anonymous{

    default void show(){
        System.out.println("Base interface");
    }

    void hello();

}

public class AnonymousClassInterface {

    public static void main(String[] args) {
        
        Anonymous obj = new Anonymous(){

            public void hello(){
                System.out.println("Object of anonymous class");
            }

        };

        obj.hello();
        obj.show();

        System.out.println();

        //Create an anonymous object anonymous class
        //And calling method 'showAll'

        new Anonymous(){

            public void hello(){
                System.out.println("Anonymous object");
            }

            void showAll(){
                hello();
                show();
            }

        }.showAll();

    }
    
}
