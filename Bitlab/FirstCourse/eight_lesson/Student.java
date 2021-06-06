package Bitlab.eight_lesson;

public class Student {
    int id;
    String name;
    String surname;
    double gpa;

    public Student(){
        id = 1;
        name = "unknown";
        surname = "unknown";
        gpa = 1.0;
    }
    public Student(int id, String name, String surname, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData(){
        return "ID: " + id +
                "\nName: " + name +
                "\nSurname: " + surname +
                "\nGPA: " + gpa;
    }
}
