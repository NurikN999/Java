package Chapter8.InnerClasses;
import static javax.swing.JOptionPane.*;


class BankAccount{

    double rate;
    Person fellow;


    BankAccount(String name, double money, int time, double r){
        this.rate = r;
        fellow = new Person(name, money, time);
    }

    void show(){
        showMessageDialog(null, 
                          fellow,
                          "Deposit",
                          INFORMATION_MESSAGE);

                          
    }

    class Person{

        String name;
        double money;
        int time;
    
        public Person(String name, double money, int time){
            this.name = name;
            this.money = money;
            this.time = time;
        }
    
        public double getMoney(){
            double s = money;
    
            for(int i = 1; i <= time; i++){
                s*= (1 + rate / 100);
            }
    
            s = Math.round(s * 100) / 100.0;
    
            return s;
        }
    
        public String toString(){
            return "Name: " + name + 
                "\nYour money: " + money + 
                "\nRate: " + rate + 
                "\nTime(year): " + time + 
                "\nFinal sum: " + getMoney();
        }
    
    }

}






public class UsingInnerClassDemo {

    public static void main(String[] args) {
        
        BankAccount nurik = new BankAccount("Nurkamal Nurmukhamed",
                                             1000,
                                             5,
                                             8.0);
    
        nurik.show();

    }
    
}
