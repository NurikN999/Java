package Bitlab.tenth_lesson.Exercise4;

import Bitlab.tenth_lesson.Exercise4.User;

public class Student extends User {
    String name;
    String surname;
    String group;
    double gpa;

    public Student(int id, String login, String password, String name, String surname, String group, double gpa) {
        super(id, login, password);
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    String getUserData() {
        return "Student INFO:" +
                "\nID: " + getId() +
                "\nLogIn: " + getLogin() +
                "\nPassword: " + getPassword() +
                "\nName: " + getName() +
                "\nSurname: " + getSurname() +
                "\nGroup: " + getGroup() +
                "\nGPA: " + getGpa();
    }
}
