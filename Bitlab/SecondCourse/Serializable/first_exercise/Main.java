


import java.io.*;
import java.util.*;
public class Main {

    static final String fileName = "memory.dat";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isStop = false;

        while(!isStop){
            System.out.println("PRESS [1] TO ADD STUDENT" +
                             "\nPRESS [2] TO LIST STUDENTS" +
                             "\nPRESS [0] TO EXIT");

            char choice = in.next().charAt(0);
            if(choice == '1'){

                ArrayList students = getStudentsList();

                System.out.print("\tENTER NAME: ");
                String name = in.next();
                System.out.print("\tENTER SURNAME: ");
                String surname = in.next();


                ArrayList<Subject> subjects = new ArrayList<>();
                boolean isStopAddSubject = false;

                while(!isStopAddSubject){

                    System.out.println("\t\tPRESS [1] TO ADD SUBJECT" +
                                       "\n\t\tPRESS [0] TO GO TO MAIN MENU");

                    char addSubject = in.next().charAt(0);

                    if(addSubject == '1'){
                        System.out.print("\t\t\tNAME: ");
                        String subjectName = in.next();
                        System.out.print("\t\t\tCREDITS: ");
                        int credits = in.nextInt();

                        subjects.add(new Subject(subjectName, credits));

                    }else if(addSubject == '0'){
                        isStopAddSubject = true;
                    }
                }

                Student student = new Student(name, surname,subjects);
                students.add(student);
                saveStudents(students);
            }else if(choice == '2'){
                ArrayList studentsList = getStudentsList();

                for (int i = 0; i < studentsList.size(); i++) {
                    System.out.println((i + 1) + ") " + studentsList.get(i));
                }

            }else if(choice == '0')
                isStop = true;
        }
    }

    static void saveStudents(ArrayList<Student> students){

        try{
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            outputStream.writeObject(students);

            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    static ArrayList<Student> getStudentsList(){

        ArrayList<Student> students = new ArrayList<>();

        try{

            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            students = (ArrayList<Student>) inputStream.readObject();

            inputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }
}
