package Bitlab.ninth_lesson;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Student student = new Student(190107003,"NurikN","qwerty123","Nurmukhamed","Nurkamal",3.01);
        student.addCourse("Introduction to Java");
        Student student2 = new Student();
        Student student3 = new Student(190107004,"z_ack","qwerty","Zack","Snaider",3.45);
        student3.addCourse("Filmography");
        Student student4 = new Student(190107005,"barry_flash","qwerty111","Barry","Allen",4.0);
        student4.addCourse("Physical Education");
        Student student5 = new Student(190107006,"ula_iz_aula","qwerty123","Ulan","Bayakhmetov",2.56);

        Staff staff1 = new Staff();
        Staff staff2 = new Staff(1,"soft_eng","software11","Arslan","Nurmangaliev",350000);
        Staff staff3 = new Staff(2,"dev","developer11","Ilya","Varnavski",275000);
        Staff staff4 = new Staff(3,"soft_eng","software11","Arslan","Nurmangaliev",350000);
        Staff staff5 = new Staff(4,"soft_eng","software11","Arslan","Nurmangaliev",350000);

        User user1 = new User();
        User user2 = new User(10,"Useruser1","user123","Arman","Ordabek");
        User user3 = new User(11,"Useruser2","user123","Nurlihan","Yussupov");
        User user4 = new User(12,"Useruser3","user123","Abylay","Kalimanov");
        User user5 = new User(13,"Useruser4","user123","Georgiy","Vasiliev");

        User[] users = {student,student2,student3,student4,student5,
                        staff1,staff2,staff3,staff4,staff5,
                        user1,user2,user3,user4,user5};

        for (User user: users) {
            user.getData();
        }
    }
}
