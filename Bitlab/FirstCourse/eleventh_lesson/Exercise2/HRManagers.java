package Bitlab.eleventh_lesson.Exercise2;

public class HRManagers implements Workers{
    private int id;
    private String fullName;
    private int salary;

    public HRManagers(){

    }

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "HR MANAGERS INFO: " +
                "\n\tID: " + id +
                "\n\tFULL NAME: " + fullName +
                "\n\tSALARY: " + salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
