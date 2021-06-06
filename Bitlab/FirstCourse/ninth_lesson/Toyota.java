package Bitlab.ninth_lesson;

public class Toyota extends Car {
    String manufacturer;

    public Toyota() {
        super();
        manufacturer = "unknown";
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    @Override
    public void ride() {
        super.ride();
        System.out.println("Manufacturer: " + manufacturer);
    }
}
