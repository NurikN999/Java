package Bitlab.Project;

public class Database {
    public static BankAccount[] allAccounts = new BankAccount[10];
    static {
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",200_000,"KZ010322312","0102");
        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",10_000,"KZ010322313","0101");
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",2000,"KZ0101112","0102");
        allAccounts[3] = new NationalBankAccount("Erbol Assanbek",1000,"KZ0101113","0101");
        allAccounts[4] = new CityBankAccount("Nurmukhamed","Nurkamal",300_000,"KZ010322314","9235");
        allAccounts[5] = new CityBankAccount("Alikhan","Nurkamal",250_000,"KZ010322315","1234");
        allAccounts[6] = new NationalBankAccount("Nurmukhamed Nurkamal",450_000,"KZ0101113","9235");
        allAccounts[7] = new NationalBankAccount("Alikhan Nurkamal",375_000,"KZ0101115","6549");
        allAccounts[8] = new CityBankAccount("Azamat","Akayev",150_000,"KZ010322318","7531");
        allAccounts[9] = new NationalBankAccount("Azamat Akayev",145_000,"KZ0101118","1456");
    }

}
