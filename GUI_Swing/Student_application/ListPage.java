package GUI_Swing.Student_application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListPage extends JPanel {

    private MainFrame parent;
    private JTextArea textArea;
    private JButton backButton;
    private Student[] students;

    public ListPage(MainFrame parent){
        this.parent = parent;

        setSize(600,800);
        setLocation(0,0);
        setLayout(null);

        textArea = new JTextArea();
        textArea.setSize(400,500);
        textArea.setLocation(100,70);
        textArea.setEditable(false);

        add(textArea);

        backButton = new JButton("BACK");
        backButton.setSize(300,30);
        backButton.setLocation(150,600);
        add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getListPage().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });
    }

    public void updateUsers(Student[] users){
        String areaContent = "";
        for (int i = 0; i < parent.getAddPage().getSizeOfArray(); i++) {
            areaContent += users[i].getId() + " " + users[i].getName() + " " + users[i].getSurname() + " - " + users[i].getFaculty() + " - " + users[i].getGroup() + "\n";
        }

        textArea.setText(areaContent);
    }
}
