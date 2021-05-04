import java.util.*;
public class OverrideMethodApplication{
    public static void main(String[] args){
        ObjA a = new ObjA("ObjA");
        a.show();

        ObjB b = new ObjB("ObjB",5356);
        b.show();
    }
}

class ObjA{
    private String name;
    public ObjA(String name){
        this.name = name;
    }
    void show(){
        System.out.println("-------------");
        System.out.println("name field: " + name);
    }
}

class ObjB extends ObjA{
    private int code;
    public ObjB(String name, int code){
        super(name);
        this.code = code;
    }
    @Override
    void show(){
        super.show();
        System.out.println("code field: " + code);
    }
}