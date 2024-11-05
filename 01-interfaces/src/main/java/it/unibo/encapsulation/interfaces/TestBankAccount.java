package it.unibo.encapsulation.interfaces;

public class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {

        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);
        AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        BankAccount andreaRossiAccount = new SimpleBankAccount(andreaRossi.getUserID(), 0);
        BankAccount alexBianchiAccount = new StrictBankAccount(alexBianchi.getUserID(), 0);
        

        andreaRossiAccount.deposit(1, 10000);
        alexBianchiAccount.deposit(2, 10000);
        andreaRossiAccount.withdraw(1,15000);
        alexBianchiAccount.withdraw(1,15000);

        System.out.println(andreaRossiAccount.getBalance()); // -5000
        System.out.println(alexBianchiAccount.getBalance()); // 10.000

        andreaRossiAccount.deposit(1, 10000);
        alexBianchiAccount.deposit(2, 10000);
        alexBianchiAccount.chargeManagementFees(1);
        alexBianchiAccount.chargeManagementFees(2);

        System.out.println(andreaRossiAccount.getBalance()); // 5000
        System.out.println(alexBianchiAccount.getBalance()); // ?
    }
}
