import java.util.*;

public class UsingAbstractClassApplication{
    public static void main(String[] args){
        Triangle t = new Triangle("red",2);
        Square s = new Square("yellow",3);
        Circle c = new Circle("blue",1);

        System.out.println("Using object variable of childclass");
        t.show();
        s.show();
        c.show();

        ColoredFigure f;
        System.out.println("Using object variable of abstract class");
        f = t;
        f.show();
        f = s;
        f.show();
        f = c;
        f.show();
    }
}

abstract class ColoredFigure{
    String color;
    int size;

    ColoredFigure(String color, int size){
        this.color = color;
        this.size = size;
    }

    void show(){
        System.out.println("Figure: " + color + " " + getName());
        System.out.println("Size of (" + getSizeName() + "): " + size);
        System.out.printf("%.3f",getArea()).println();
        for(int i = 0; i < 30; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    String getSizeName(){
        return "side";
    }

    //abstract methods
    abstract String getName();
    abstract double getArea();
}

class Triangle extends ColoredFigure{
    Triangle(String color, int size){
        super(color,size);
    }

    //Abstract method description from superclass , which will return figure name.
    String getName(){
        return "Triangle";
    }

    double getArea(){
        return (Math.sqrt(3)/4) * size * size;
    }
}

class Square extends ColoredFigure{
    Square(String color, int size){
        super(color, size);
    }

    String getName(){
        return "Square";
    }

    double getArea(){
        return size * size;
    }
}

class Circle extends ColoredFigure{
    Circle(String color, int size){
        super(color, size);
    }

    String getName(){
        return "Circle";
    }

    double getArea(){
        return size * size * Math.PI;
    }

    String getSizeName(){
        return "Radius";
    }
}