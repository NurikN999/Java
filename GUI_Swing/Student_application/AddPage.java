package GUI_Swing.Student_application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPage extends JPanel {
    private MainFrame parent;
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JLabel surnameLabel;
    private JTextField surnameTextField;
    private JLabel facultyLabel;
    private String[] faculties = new String[3];
    private JComboBox facultiesComboBoxes;
    private JLabel groupLabel;
    private JTextField groupTextField;
    private JButton addButton, backButton;
    private Student[] students = new Student[100];
    private int index = 0, id = 1;

    public AddPage(MainFrame parent){
        faculties[0] = "Information Technologies";
        faculties[1] = "Economics";
        faculties[2] = "Mathematics";
        this.parent = parent;
        setLocation(0,0);
        setLayout(null);
        setSize(600,800);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setLocation(150,150);
        nameLabel.setSize(300,30);
        add(nameLabel);

        nameTextField = new JTextField();
        nameTextField.setSize(300,30);
        nameTextField.setLocation(250,150);
        add(nameTextField);

        surnameLabel = new JLabel("SURNAME: ");
        surnameLabel.setLocation(150,200);
        surnameLabel.setSize(300,30);
        add(surnameLabel);

        surnameTextField = new JTextField();
        surnameTextField.setSize(300,30);
        surnameTextField.setLocation(250,200);
        add(surnameTextField);

        facultyLabel = new JLabel("FACULTY: ");
        facultyLabel.setSize(300,30);
        facultyLabel.setLocation(150,250);
        add(facultyLabel);

        facultiesComboBoxes = new JComboBox(faculties);
        facultiesComboBoxes.setSize(300,30);
        facultiesComboBoxes.setLocation(250,250);
        add(facultiesComboBoxes);

        groupLabel = new JLabel("GROUP: ");
        groupLabel.setSize(300,30);
        groupLabel.setLocation(150,300);
        add(groupLabel);

        groupTextField = new JTextField();
        groupTextField.setSize(300,30);
        groupTextField.setLocation(250,300);
        add(groupTextField);

        addButton = new JButton("ADD");
        addButton.setSize(150,50);
        addButton.setLocation(150, 400);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String surname = surnameTextField.getText();
                String faculty = (String) facultiesComboBoxes.getSelectedItem();
                String group = groupTextField.getText();
                if(!name.equals("") && !surname.equals("") && !group.equals("")){
                    students[index] = new Student(id,name,surname,faculty,group);
                    id++;
                    index++;
                    nameTextField.setText("");
                    surnameTextField.setText("");
                    facultiesComboBoxes.setSelectedIndex(0);
                    groupTextField.setText("");
                }

            }
        });
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setSize(150,50);
        backButton.setLocation(400,400);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.getAddPage().setVisible(false);
                parent.getMainMenu().setVisible(true);
            }
        });
        add(backButton);


    }

    public Student[] getStudents(){
        return students;
    }

    public int getSizeOfArray(){
        return index;
    }
}
