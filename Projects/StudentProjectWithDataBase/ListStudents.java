package StudentProjectWithDataBase;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ListStudents extends JPanel {

    private JButton backButton;
    private JTable table;
    private String[] headers = {"ID","NAME","SURNAME","AGE"};
    private JScrollPane scrollPane;


    public ListStudents(MainFrame parent){

        setSize(800,600);
        setLayout(null);
        setLocation(0,0);

        backButton = new JButton("BACK");
        backButton.setSize(300,30);
        backButton.setLocation(250,500);
        add(backButton);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.listStudentsPage.setVisible(false);
                parent.mainMenu.setVisible(true);
                parent.repaint();
            }
        });

        table = new JTable();
        table.setFont(new Font("Roboto", Font.PLAIN, 14));
        table.setRowHeight(30);

        scrollPane = new JScrollPane(table);
        scrollPane.setSize(700,400);
        scrollPane.setLocation(50,50);
        add(scrollPane);

    }

    public void updateStudents(ArrayList<Students> students){

        Object[][] objects = new Object[students.size()][4];

        for (int i = 0; i < students.size(); i++) {
            objects[i][0] = students.get(i).getId();
            objects[i][1] = students.get(i).getName();
            objects[i][2] = students.get(i).getSurname();
            objects[i][3] = students.get(i).getAge();
        }

        DefaultTableModel model = new DefaultTableModel(objects, headers);
        table.setModel(model);
    }

}
