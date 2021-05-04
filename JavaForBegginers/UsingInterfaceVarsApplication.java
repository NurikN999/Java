interface Base{
    void show();
}

class Alpha implements Base{
    String word;
    public Alpha(String txt){
        word = txt;
    }

    @Override
    public void show(){
        System.out.println("Object of Alpha class");
        System.out.println("Text field: " + word);
        for(int i = 0; i < 30; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

class Bravo implements Base{
    int number;
    public Bravo(int number){
        this.number = number;
    }

    @Override
    public void show(){
        System.out.println("Object of Bravo class");
        System.out.println("Integer field: " + number);
        for(int i = 0; i < 30; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public class UsingInterfaceVarsApplication{
    public static void main(String[] args){
        Base a = new Alpha("Nurmukhamed");
        Base b = new Bravo(19);
        a.show();
        b.show();
    }
}