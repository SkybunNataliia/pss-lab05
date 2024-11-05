package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {

    private static double ATM_TRANSACTION_FEE = 1;

    private double balance;
    private int transactions;
    private final int id;

    public SimpleBankAccount(final int id, final double balance) {
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
            System.err.println("Permission denied. Incorrect id!");
        }
    }

    public void withdraw(final int id, final double amount) {
        if (this.id == id) {
            this.balance -= amount;
            this.transactions += 1;
        }
        else {
            System.err.println("Permission denied. Incorrect id!");
        }
    }

    public void depositFromATM(final int id, final double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int id, final double amount) {
        this.withdraw(id, amount - ATM_TRANSACTION_FEE);
    }

    public void chargeManagementFees(final int id) {
        /*
         * Riduce il bilancio del conto di un ammontare pari alle spese di gestione
         */
    }
}
