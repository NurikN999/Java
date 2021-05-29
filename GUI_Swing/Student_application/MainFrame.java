package GUI_Swing.Student_application;


import javax.swing.*;

public class MainFrame extends JFrame{
    public MainMenu mainMenu;
    public AddPage addPage;
    public ListPage listPage;

    public MainFrame(){
        setSize(600,800);
        setTitle("STUDENT APPLICATION");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        mainMenu = new MainMenu(this);
        mainMenu.setVisible(true);
        add(mainMenu);

        addPage = new AddPage(this);
        addPage.setVisible(false);
        addPage.setLocation(0,0);
        add(addPage);

        listPage = new ListPage(this);
        listPage.setVisible(false);
        listPage.setLocation(0,0);
        add(listPage);
    }

    public MainMenu getMainMenu(){
        return mainMenu;
    }

    public AddPage getAddPage(){
        return addPage;
    }

    public ListPage getListPage(){
        return listPage;
    }
}