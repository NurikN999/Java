package Bitlab.Project;

public class CityBankAccount implements BankAccount{
    private String name;
    private String surname;
    private int balance;
    private String accountNumber;
    private String pinCode;

    public CityBankAccount(){

    }

    public CityBankAccount(String name, String surname, int balance, String accountNumber, String pinCode) {
        this.name = name;
        this.surname = surname;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public int totalBalance() {
        return getBalance();
    }

    @Override
    public void creditBalance(int credit) {
        balance -= credit;
    }

    @Override
    public void debitCard(int debet) {
        balance += debet;
    }

    @Override
    public String accountData() {
        return "CITY BANK INFO" +
                "\n\tNAME: " + getName() +
                "\n\tSURNAME: " + getSurname() +
                "\n\tBALANCE: " + getBalance() +
                "\n\tACCOUNT NUMBER: " + getAccountNumber() +
                "\n\tPIN CODE: " + getPinCode();
    }
}
