package Bitlab.eight_lesson;

public class Exercise5 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(190107003,"Nurmukhamed","Nurkamal",3.15),
                new Student(190103564,"Ivanov","Ivan",2.16),
                new Student(180165345,"Damir","Ismagulov",3.65),
                new Student(200132009,"Petr","Petrov",1.65),
                new Student(190107123,"Naruto","Uzumaki",2.54),
                new Student(101010101,"Lionel","Messi",4),
                new Student(070707070,"Cristiano","Ronaldo",3.65),
                new Student(11111111,"Alikhan","Bokeihanov",4.2),
                new Student(2222222, "Serzhan","Ryskulov",2.15),
                new Student(185647333,"Aruzhan","Urmanova",3.49)};

        System.out.println(topStudent(students).getStudentData());
    }

    public static Student topStudent(Student students[]){
        double maxGpa = Double.MIN_VALUE;
        int maxGpaIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].gpa > maxGpa){
                maxGpa = students[i].gpa;
                maxGpaIndex = i;
            }
        }

        return students[maxGpaIndex];
    }
}
