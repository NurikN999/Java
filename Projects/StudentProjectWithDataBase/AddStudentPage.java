package StudentProjectWithDataBase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentPage extends JPanel{

    private JLabel name,surname, age;
    private JTextField nameField, surnameField, ageField;
    private JButton addButton, backButton;

    public AddStudentPage(MainFrame parent){

        setSize(800,600);
        setLayout(null);
        setLocation(0,0);

        name = new JLabel("NAME: ");
        name.setSize(150,30);
        name.setLocation(250,200);
        add(name);

        nameField = new JTextField();
        nameField.setSize(150,30);
        nameField.setLocation(400,200);
        add(nameField);

        surname = new JLabel("SURNAME: ");
        surname.setSize(150,30);
        surname.setLocation(250,250);
        add(surname);

        surnameField = new JTextField();
        surnameField.setSize(150,30);
        surnameField.setLocation(400,250);
        add(surnameField);

        age = new JLabel("AGE: ");
        age.setSize(150,30);
        age.setLocation(250,300);
        add(age);

        ageField = new JTextField();
        ageField.setSize(150,30);
        ageField.setLocation(400,300);
        add(ageField);

        addButton = new JButton("ADD");
        addButton.setSize(150,30);
        addButton.setLocation(250,350);
        add(addButton);

        backButton = new JButton("BACK");
        backButton.setSize(150,30);
        backButton.setLocation(400,350);
        add(backButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String surname = surnameField.getText();
                int age = Integer.parseInt(ageField.getText());

                Students student = new Students(null, name, surname, age);
                Main.addStudent(student);

                nameField.setText("");
                surnameField.setText("");
                ageField.setText("");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.addStudentPage.setVisible(false);
                parent.mainMenu.setVisible(true);
            }
        });


    }

}
