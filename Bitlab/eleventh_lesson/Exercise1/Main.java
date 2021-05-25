package Bitlab.eleventh_lesson.Exercise1;

public class Main {
    public static void main(String[] args) {
        Users[] users = {new Users("Mike", "Smith"),
                new Users("John", "Weekend"),
                new Users("Johny", "Dep"),
                new Users("John", "Johns"),
                new Users("Nurmukhamed", "Nurkamal"),
                new Users("Alikhan", "Nurkamal"),
                new Users("Naruto", "Uzumaki"),
                new Users("Adilzhan", "Nurkamal"),
                new Users("Dana", "Akhmetova"),
                new Users("Zhanat", "Akhmetova")};
        UserBeanlmp beanlmp = new UserBeanlmp(users);
        beanlmp.getUsersByName("John");
        System.out.println();
        beanlmp.getUsersBySurname("Smith");
    }
}
