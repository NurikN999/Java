package Bitlab.eleventh_lesson.Exercise2;

public class Programmers implements Workers {
    private int id;
    private String nickName;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickName, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickName = nickName;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "PROGRAMMER INFO: " +
                "\n\tID: " + id +
                "\n\tNICKNAME: " + nickName +
                "\n\tBONUS SALARY: " + bonusSalary +
                "\n\tKPI VALUE: " + KPIValue +
                "\n\tSALARY: " + salary;
    }

    @Override
    public int getSalary() {
        return (int)(salary + KPIValue * bonusSalary);
    }
}
