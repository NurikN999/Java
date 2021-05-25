package Bitlab.tenth_lesson.Exercise4;

public class Teacher extends User {
    String nickName;
    String status;
    String[] subjects = new String[10];
    int sizeOfSubjects = 0;

    public Teacher() {
        nickName = "unknown";
        status = "unknown";
        subjects = null;
        sizeOfSubjects = 0;
    }

    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeOfObjects() {
        return sizeOfSubjects;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addSubject(String subject) {
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    public String returnData() {
        String res = "";
        for (int i = 0; i < sizeOfSubjects; i++) {
            res += subjects[i] + "\n";
        }
        return res;
    }

    @Override
    String getUserData() {
        return "Teacher INFO:" +
                "\nID: " + getId() +
                "\nLogIn: " + getLogin() +
                "\nPassword: " + getPassword() +
                "\nName: " + getNickName() +
                "\nSurname: " + getStatus() +
                "\n" + returnData();
    }
}
