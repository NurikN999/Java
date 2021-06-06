package Bitlab.tenth_lesson.Exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ERPSystem system = new ERPSystem();

        Scanner in = new Scanner(System.in);

        boolean isStop = false;

        while(!isStop){
            System.out.println("PRESS [1] TO ADD USER" +
                    "\nPRESS [2] TO LIST USERS" +
                    "\nPRESS [3] TO LIST USER BY INDEX" +
                    "\nPRESS [0] TO EXIT");
            String firstChoice = in.next();
            if(firstChoice.charAt(0) == '1') {
                boolean isStopAdd = false;
                int studentId = 1;
                int teacherId = 1;

                while (!isStopAdd) {
                    System.out.println("PRESS [1] TO ADD STUDENT" +
                                     "\nPRESS [2] TO ADD TEACHER" +
                                     "\nPRESS [0] TO FINISH ADDING USERS");
                    String addChoice = in.next();
                    if(addChoice.charAt(0) == '1'){
                        System.out.print("Login: ");
                        String login = in.next();
                        System.out.print("Password: ");
                        String password = in.next();
                        System.out.print("Name: ");
                        String name = in.next();
                        System.out.print("Surname: ");
                        String surname = in.next();
                        System.out.print("Group: ");
                        String group = in.next();
                        System.out.print("GPA: ");
                        double gpa = in.nextDouble();
                        system.addUser(new Student(studentId,login,password,name,surname,group,gpa));
                        studentId++;
                    }else if(addChoice.charAt(0) == '2'){
                        System.out.print("Login: ");
                        String login = in.next();
                        System.out.print("Password: ");
                        String password = in.next();
                        System.out.print("Nick Name: ");
                        String nickName = in.next();
                        System.out.print("Status: ");
                        String status = in.next();
                        Teacher teacher1 = new Teacher(teacherId,login,password,nickName,status);
                        teacherId++;
                        System.out.println("PRESS [1] TO ADD SUBJECT");
                        System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                        String addSubject = in.next();
                        if(addSubject.charAt(0) == '1') {
                            boolean isStopAddingSubject = false;
                            while (!isStopAddingSubject) {
                                System.out.print("Subject: ");
                                String subject = in.next();
                                teacher1.addSubject(subject);
                                System.out.println("PRESS [1] TO ADD SUBJECT");
                                System.out.println("PRESS [0] TO FINISH ADDING SUBJECT");
                                addSubject = in.next();
                                if(addSubject.charAt(0) == '0')
                                    isStopAddingSubject = true;
                            }
                        }
                        system.addUser(teacher1);
                    }else if(addChoice.charAt(0) == '0')
                        isStopAdd = true;
                }

            }else if(firstChoice.charAt(0) == '2'){
                System.out.println("PRESS [1] TO LIST STUDENTS" +
                                 "\nPRESS [2] TO LIST TEACHERS");
                String listChoice = in.next();
                if(listChoice.charAt(0) == '1'){
                    for (int i = 0; i < system.sizeOfUsers; i++) {
                        if(system.memory[i] instanceof Student)
                            System.out.println(system.memory[i].getUserData());
                    }
                }else if(listChoice.charAt(0) == '2'){
                    for (int i = 0; i < system.sizeOfUsers; i++) {
                        if(system.memory[i] instanceof Teacher)
                            System.out.println(system.memory[i].getUserData());
                    }
                }
            }
            else if(firstChoice.charAt(0) == '3'){
                System.out.print("ENTER INDEX: ");
                int index = in.nextInt();
                System.out.println(system.memory[index].getUserData());
            }else if(firstChoice.charAt(0) == '0')
                isStop = true;
        }

    }
}
