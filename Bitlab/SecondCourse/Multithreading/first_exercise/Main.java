package BITLAB.Multithreading.first_exercise;

public class Main {

    public static void main(String[] args) {
        Operation operation1 = new Operation("Add Client to Bank", 4);
        Operation operation2 = new Operation("Remove Client to Bank", 4);
        Operation operation3 = new Operation("Show Balance of the Account", 2);
        Operation operation4 = new Operation("Read the Card", 5);
        Operation operation5 = new Operation("Connect with DataBase", 3);
        Operation operation6 = new Operation("Pull the Data", 2);
        Operation operation7 = new Operation("Push Info from New Client", 5);
        Operation operation8 = new Operation("Make a Debit or Credit Card", 7);
        Operation operation9 = new Operation("Create an Account in Database", 3);
        Operation operation10 = new Operation("Play game", 3);

        operation1.start();
        operation2.start();
        operation3.start();
        operation4.start();
        operation5.start();
        operation6.start();
        operation7.start();
        operation8.start();
        operation9.start();
        operation10.start();
    }
}
