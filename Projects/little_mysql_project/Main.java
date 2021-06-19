package little_mysql_project;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DataBaseManager db = new DataBaseManager();
        db.connect();

        ArrayList cars = db.getCars();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        db.addCar(new Cars( 3, "Toyota Camry 70", 13000000, 3.5));

        cars = db.getCars();

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}
