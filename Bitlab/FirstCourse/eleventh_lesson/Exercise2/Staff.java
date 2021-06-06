package Bitlab.eleventh_lesson.Exercise2;

public class Staff implements Workers{
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff(){

    }
    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "STAFF INFO: " +
                "\n\tID: " + id +
                "\n\tNAME: " + name +
                "\n\tSURNAME: " + surname +
                "\n\tSALARY: " + salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
