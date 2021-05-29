package GUI_Swing.Student_application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel {

    private MainFrame parent;
    private JButton addStudentButton;
    private JButton listStudentButton;
    private JButton exitButton;

    public MainMenu(MainFrame parent){
        this.parent = parent;

        setSize(600,800);
        setLayout(null);

        addStudentButton = new JButton("ADD STUDENT");
        addStudentButton.setSize(300,30);
        addStudentButton.setLocation(150,150);
        add(addStudentButton);
        addStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getMainMenu().setVisible(false);
                parent.getAddPage().setVisible(true);
            }
        });

        listStudentButton = new JButton("LIST STUDENTS");
        listStudentButton.setSize(300,30);
        listStudentButton.setLocation(150,200);
        add(listStudentButton);
        listStudentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getListPage().updateUsers(parent.getAddPage().getStudents());
                parent.getMainMenu().setVisible(false);
                parent.getListPage().setVisible(true);
            }
        });

        exitButton = new JButton("EXIT");
        exitButton.setSize(300,30);
        exitButton.setLocation(150,250);
        add(exitButton);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
}
