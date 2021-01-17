package com.bankAccount;

public class BackAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.depositMoney(100.00, "checking");
        account1.depositMoney(200.00, "savings");
        account1.displayAccountBalance();

        account1.withdrawMoney(30, "checking");
        account1.withdrawMoney(500, "savings");
        account1.displayAccountBalance();

    }
}
