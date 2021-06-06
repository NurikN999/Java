package Bitlab.eight_lesson;
public class Phone{

    private String name;
    private String model;
    private int price;

    public Phone() {
        name = "Some Phone";
        model = "Some Model";
        price = 25000;
    }

    public Phone(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public void getData(){
        System.out.println("Name: " + name +
                           "\nModel: " + model +
                           "\nPrice: " + price);
    }
}