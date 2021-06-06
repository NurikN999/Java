package Bitlab.ninth_lesson;

public class Exercise1 {
    public static void main(String[] args) {
        Car car = new Car();
        Car mercedesE220 = new Mercedes("Mercedes", "E220", 280, 1994, 2.2, "E");
        Car toyotaCamry = new Toyota("Toyota", "Camry 70", 280, 2020, 3.5, "Japan");


        Car[] cars = {car,mercedesE220,toyotaCamry};
        for (Car auto : cars) {
            auto.ride();
        }
    }
}
