package Bitlab.Project;

import javax.xml.crypto.Data;
import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("GOOD DAY!" + "\nPLEASE,ENTER YOUR ACCOUNT NUMBER AND PIN_CODE");
        System.out.print("ACCOUNT NUMBER: ");
        String accountNumber = in.next();
        boolean isThereAccount = false;
        int indexOfAccount = 0;
        while(!isThereAccount) {
            for (int i = 0; i < 10; i++) {
                if(Database.allAccounts[i].getAccountNumber().equals(accountNumber)) {
                    isThereAccount = true;
                    indexOfAccount = i;
                    break;
                }
            }
            if(isThereAccount == false){
                System.out.println("THERE IS NO SUCH ACCOUNT NUMBER,PLEASE TRY AGAIN: ");
                accountNumber = in.next();
            }
        }
        System.out.print("PIN CODE: ");
        String pinCode = in.next();
        boolean isPinCorrect = false;
        if(Database.allAccounts[indexOfAccount].getPinCode().equals(pinCode))
            isPinCorrect = true;

        if(isThereAccount == true && isPinCorrect == true && Database.allAccounts[indexOfAccount] instanceof CityBankAccount){
            boolean isStop = false;
            while (!isStop){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL" +
                                "\nPRESS [2] TO VIEW BALANCE" +
                                "\nPRESS [3] TO CHANGE PIN CODE" +
                                "\nPRESS [4] TO CASH IN ACCOUNT" +
                                "\nPRESS [5] TO VIEW ACCOUNT DATA" +
                                "\nPRESS [6] TO EXIT");
                String choice = in.next();
                if(choice.charAt(0) == '1'){
                    System.out.println("HOW MUCH YOU WANT WITHDRAW?: ");
                    int withdrawal = in.nextInt();
                    Database.allAccounts[indexOfAccount].creditBalance(withdrawal);
                }else if(choice.charAt(0) == '2'){
                    System.out.println("YOUR BALANCE IS: " + Database.allAccounts[indexOfAccount].totalBalance() + "KZT");
                }else if(choice.charAt(0) == '3'){
                    System.out.println("ENTER NEW PIN CODE: ");
                    String newPinCode = in.next();
                    Database.allAccounts[indexOfAccount].setPinCode(newPinCode);
                    System.out.println("SUCCESSFUL!");
                }else if(choice.charAt(0) == '4'){
                    System.out.print("HOW MUCH YOU WANT TO CASH?: ");
                    int cashInAcc = in.nextInt();
                    Database.allAccounts[indexOfAccount].debitCard(cashInAcc);
                }else if(choice.charAt(0) == '5'){
                    System.out.println(Database.allAccounts[indexOfAccount].accountData());
                }else if(choice.charAt(0) == '6'){
                    isStop = true;
                }
            }
        }else if(isThereAccount == true && isPinCorrect == true && Database.allAccounts[indexOfAccount] instanceof NationalBankAccount){
            boolean isStop = false;
            while(!isStop){
                System.out.println("PRESS [1] TO CASH WITHDRAWAL" +
                                 "\nPRESS [2] TO VIEW BALANCE" +
                                 "\nPRESS [3] TO EXIT");
                String choice = in.next();
                if(choice.charAt(0) == '1'){
                    System.out.println("HOW MUCH YOU WANT TO WITHDRAW: ");
                    int withdraw = in.nextInt();
                    Database.allAccounts[indexOfAccount].creditBalance(withdraw);
                }else if(choice.charAt(0) == '2'){
                    System.out.println("YOUR BALANCE IS: " + ((NationalBankAccount) Database.allAccounts[indexOfAccount]).getBalance()+ "$");
                }else if(choice.charAt(0) == '3')
                    isStop = true;
            }
        }
    }
}
