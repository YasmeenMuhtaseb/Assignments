package com.bankAccount;

import java.util.Random;

public class BankAccount {
    private String accountNumber = "";
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private static int numberOfAccounts =0;
    private static double totalAmountOfMoney =0.0;

    public BankAccount() {
        this.numberOfAccounts+=1;
        this.accountNumber = AccountNumber();
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }



    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }



    public static double getTotalAmountOfMoney() {
        return totalAmountOfMoney;
    }


    private String AccountNumber(){
        Random r = new Random();
        String account ="";
        for (int i =0;i<10;i++){
            account+=r.nextInt(10);
        }
        return account;
    }
    public void depositMoney(double amount,String account){
        if(account.equals("savings"))
            this.savingsBalance += amount;
        else if(account.equals("checking"))
            this.checkingBalance += amount;
        this.totalAmountOfMoney += amount;
    }

    public void withdrawMoney(double amount, String account) {
        if(account.equals("savings")) {
            if(this.savingsBalance - amount >= 0) {
                this.savingsBalance -= amount;
                this.totalAmountOfMoney -= amount;
            }
            else{
                System.out.println("insufficient funds");
            }
        }
        else if(account.equals("checking")) {
            if(this.checkingBalance - amount >= 0) {
                this.checkingBalance -= amount;
                this.totalAmountOfMoney -= amount;
            }
            else{
                System.out.println("insufficient funds");
            }
        }
    }

    public void displayAccountBalance() {
        System.out.println("Saving: "+getSavingsBalance()+" "+"Checking: "+getCheckingBalance());
    }
}
