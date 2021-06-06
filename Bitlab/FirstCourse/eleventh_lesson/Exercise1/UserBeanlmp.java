package Bitlab.eleventh_lesson.Exercise1;

public class UserBeanlmp implements UserBean {
    Users[] users;

    public UserBeanlmp(Users[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name))
                System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname().equals(surname))
                System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }
}
