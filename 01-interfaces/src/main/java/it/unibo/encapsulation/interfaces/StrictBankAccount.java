package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount {

    private static double ATM_TRANSACTION_FEE = 1;

    private double balance;
    private int transactions;
    private final int id;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.transactions = 0;
        this.balance = balance;
    }

    public int getid() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

    public void deposit(final int id, final double amount) {
        if (this.id == id) {
            this.balance += amount;
            this.transactions += 1;
        }
        else {
            System.err.println("Permission denied. Incorrect ID!");
        }
    }

    public void withdraw(final int id, final double amount) {
        if (this.id == id) {
            if (amount < this.balance) {
                this.balance -= amount;
                this.transactions += 1;
            }
            else {
                System.err.println("Insufficient funds!");
            }
        }
        else {
            System.err.println("Permission denied. Incorrect ID!");
        }
    }

    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount);
        this.balance -= ATM_TRANSACTION_FEE;
    }

    public void chargeManagementFees(final int id) {
        if (this.id == id) {
            double fees = 5 + 0.1 * this.transactions;
            if (this.balance >= fees) {
                this.balance -= fees;
                this.transactions += 1;
            }
        }
    }    
}
