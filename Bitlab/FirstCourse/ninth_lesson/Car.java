package Bitlab.ninth_lesson;

public class Car {
    String name;
    String model;
    int maxSpeed;
    int year;
    double volume;

    public Car() {
        name = "unknown";
        model = "unknown";
        maxSpeed = 0;
        year = 1990;
        volume = 1.6;
    }

    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public void ride() {
        System.out.println("Car characteristics: " +
                "\nName of the car: " + name +
                "\nModel: " + model +
                "\nMax speed of this car: " + maxSpeed +
                "\nYear of production: " + year +
                "\nVolume of this car: " + volume);
        System.out.println("Car is riding....");
    }
}
