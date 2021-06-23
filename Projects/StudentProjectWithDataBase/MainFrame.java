package StudentProjectWithDataBase;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainMenu mainMenu;
    public AddStudentPage addStudentPage;
    public ListStudents listStudentsPage;

    public MainFrame(){

        setTitle("Student App");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setResizable(false);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);
        add(mainMenu);

        addStudentPage = new AddStudentPage(this);
        addStudentPage.setVisible(false);
        add(addStudentPage);

        listStudentsPage = new ListStudents(this);
        listStudentsPage.setVisible(false);
        add(listStudentsPage);

    }

}
