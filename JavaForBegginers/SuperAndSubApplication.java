import java.util.*;
public class SuperAndSubApplication{
    public static void main(String[] args){
        Alpha a = new Alpha();
        a.name = "alpha";
        a.show();

        Bravo b = new Bravo();
        b.name = "bravo";
        b.code = 123;
        b.show();


        a = b;
        // a -> b
        /*
            Object of Bravo class
            name field: bravo -> charlie
            code field: 123
        */
        a.name = "charlie";
        a.show();


        b.show();
    }
}

class Alpha{
    String name;
    void show(){
        String txt = "Object of Alpha class" + 
                     "\nname field: " + name + 
                     "\n";
        for(int i = 0; i < 21; i++){
            txt += "-";
        }
        System.out.println(txt);
    } 
}

class Bravo extends Alpha{
    int code;

    void show(){
        String txt = "Object of Bravo class" + 
                     "\nname field: " + name + 
                     "\ncode field " + code + "\n";
        for(int i = 0; i < 21; i++){
            txt += "-";
        }
        System.out.println(txt);
    }
}