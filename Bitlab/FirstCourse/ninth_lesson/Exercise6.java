package Bitlab.ninth_lesson;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isStop = false;
        User[] users = new User[1000];
        int size = 0;

        while(!isStop){
            System.out.println("PRESS [1] ADD USER" +
                                "\n\tPRESS [1] TO ADD STUDENT" +
                                "\n\tPRESS [2] TO ADD STAFF");
            System.out.println("PRESS [2] TO LIST USERS" +
                    "\n\tPRESS [1] TO LIST STUDENT" +
                    "\n\tPRESS [2] TO LIST STAFF");
            System.out.println("PRESS [0] TO EXIT");

            String first = in.next();

            if(first.charAt(0) == '1'){
                String second = in.next();
                if(second.charAt(0) == '1'){
                    System.out.print("Enter an ID of Student: ");
                    int id = in.nextInt();
                    System.out.print("Enter login: ");
                    String login = in.next();
                    System.out.print("Enter password: ");
                    String password = in.next();
                    System.out.print("Enter name of the Student: ");
                    String name = in.next();
                    System.out.print("Enter surname of Student: ");
                    String surname = in.next();
                    System.out.print("Enter GPA: ");
                    double gpa = in.nextDouble();
                    users[size] = new Student(id,login,password,name,surname,gpa);
                    size++;
                }else if(second.charAt(0) == '2'){
                    System.out.print("Enter an ID of Staff: ");
                    int id = in.nextInt();
                    System.out.print("Enter login: ");
                    String login = in.next();
                    System.out.print("Enter password: ");
                    String password = in.next();
                    System.out.print("Enter name of Staff: ");
                    String name = in.next();
                    System.out.print("Enter surname of Staff: ");
                    String surname = in.next();
                    System.out.print("Enter a salary of Staff: ");
                    double salary = in.nextDouble();
                    users[size] = new Staff(id,login,password,name,surname,salary);
                    size++;
                }else{
                    System.out.println("There is no such option. Please Enter again");
                }
            }
            else if(first.charAt(0) == '2'){
                String second = in.next();
                if(second.charAt(0) == '1'){
                    for (int i = 0; i < size; i++) {
                        if(users[i] instanceof Student)
                            users[i].getData();
                    }
                }else if(second.charAt(0) == '2'){
                    for (int i = 0; i < size; i++) {
                        if(users[i] instanceof Staff)
                            users[i].getData();
                    }
                }
            }
            else if(first.charAt(0) == '0') {
                isStop = true;
            }

        }
    }
}
