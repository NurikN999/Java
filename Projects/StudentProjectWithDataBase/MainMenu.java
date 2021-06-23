package StudentProjectWithDataBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private JButton addStudentsButton;
    private JButton listStudentsButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent){

        setSize(800,600);
        setLayout(null);
        setLocation(0,0);

        addStudentsButton = new JButton("ADD STUDENT");
        addStudentsButton.setSize(300,30);
        addStudentsButton.setLocation(250,200);
        add(addStudentsButton);

        addStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.mainMenu.setVisible(false);
                parent.addStudentPage.setVisible(true);
            }
        });

        listStudentsButton = new JButton("LIST STUDENTS");
        listStudentsButton.setSize(300,30);
        listStudentsButton.setLocation(250,250);
        add(listStudentsButton);

        listStudentsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                parent.listStudentsPage.updateStudents(Main.getStudents());
                parent.mainMenu.setVisible(false);
                parent.listStudentsPage.setVisible(true);
            }
        });

        exitButton = new JButton("EXIT");
        exitButton.setSize(300,30);
        exitButton.setLocation(250,300);
        add(exitButton);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
