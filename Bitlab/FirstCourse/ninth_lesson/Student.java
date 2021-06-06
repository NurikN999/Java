package Bitlab.ninth_lesson;

public class Student extends User {
    private double gpa;
    private String courses[] = new String[100];
    private int indexOfCourses = 0;

    public Student(){
        gpa = 0;
        indexOfCourses = 0;
    }
    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getIndexOfCourses() {
        return indexOfCourses;
    }

    public void setIndexOfCourses(int indexOfCourses) {
        this.indexOfCourses = indexOfCourses;
    }

    public void addCourse(String course) {
        courses[indexOfCourses] = course;
        indexOfCourses++;
    }

    public void printCourse() {
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println(courses[i] + " ");
        }
    }

    public void getData() {
        super.getData();
        System.out.println("GPA: " + getGpa() +
                "\nIndex of courses: " + getIndexOfCourses());
        printCourse();
    }
}
