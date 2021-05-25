package Bitlab.eight_lesson;

public class Exercise4 {
    public static void main(String[] args) {

        Student[] students = {new Student(190107003,"Nurmukhamed","Nurkamal",3.15),
                              new Student(190103564,"Ivanov","Ivan",2.16),
                new Student(180165345,"Damir","Ismagulov",3.65),
                new Student(200132009,"Petr","Petrov",1.65),
                new Student(190107123,"Naruto","Uzumaki",2.54)
        };

        for (Student student : students) {
            System.out.print(student.getStudentData());
        }
    }
}
