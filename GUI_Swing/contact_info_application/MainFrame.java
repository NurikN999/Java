package GUI_Swing.contact_info_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JLabel label, phoneLabel, ageLabel;
    private JButton button;
    private JTextField textField, phoneField;
    private JComboBox agesComboBox;
    private Integer[] ages = new Integer[100];
    private JTextArea textArea;

    public MainFrame(){

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
        }
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(600,800);
        setLayout(null);

        label = new JLabel("NAME: ");
        label.setSize(300,30);
        label.setLocation(100,150);
        label.setFont(new Font(Font.SERIF, Font.ITALIC, 10));
        add(label);

        phoneLabel = new JLabel("PHONE: ");
        phoneLabel.setSize(300,30);
        phoneLabel.setLocation(100,200);
        phoneLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 10));
        add(phoneLabel);

        ageLabel = new JLabel("AGE: ");
        ageLabel.setSize(300,30);
        ageLabel.setLocation(100,250);
        ageLabel.setFont(new Font(Font.SERIF, Font.ITALIC, 10));
        add(ageLabel);

        textField = new JTextField();
        textField.setSize(300,30);
        textField.setLocation(200,150);
        add(textField);

        phoneField = new JTextField();
        phoneField.setSize(300,30);
        phoneField.setLocation(200,200);
        add(phoneField);

        agesComboBox = new JComboBox(ages);
        agesComboBox.setSize(300,30);
        agesComboBox.setLocation(200,250);
        add(agesComboBox);

        textArea = new JTextArea();
        textArea.setLocation(100,400);
        textArea.setSize(400,200);

        button = new JButton("ADD CONTACT");
        button.setSize(400,30);
        button.setLocation(100,300);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String phone = phoneField.getText();
                Integer age = (Integer) agesComboBox.getSelectedItem();
                if(!text.equals("")){
                    textArea.append(text + " : " + phone + " : " + age + " years");
                    textField.setText("");
                    phoneField.setText("");
                    agesComboBox.setSelectedIndex(0);
                }
            }
        });
        add(button);
        add(textArea);
    }
}
