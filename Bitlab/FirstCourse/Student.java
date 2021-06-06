package Bitlab;

public class Student extends Person{
    int id;

    public Student() {
        name = "unknown";
        surname = "unknown";
        id = 0;
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printInfo(){
        System.out.println("Name: " + name + "\nID: " + id);
    }
}
