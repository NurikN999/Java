package Bitlab.ninth_lesson;

public class Staff extends User {
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    public Staff() {
        salary = 0;
        indexOfSubject = 0;
    }

    public Staff(int id, String login, String password, String name, String surname, double salary) {
        super(id, login, password, name, surname);
        this.salary = salary;
    }

    public void addSubject(String subject) {
        subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }

    public void printData() {
        for (int i = 0; i < getIndexOfSubject(); i++) {
            System.out.println(subjects[i] + " ");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public int getIndexOfSubject() {
        return indexOfSubject;
    }

    public void setIndexOfSubject(int indexOfSubject) {
        this.indexOfSubject = indexOfSubject;
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println("Salary: " + getSalary() +
                "\nSubjects: ");
        printData();
    }
}
