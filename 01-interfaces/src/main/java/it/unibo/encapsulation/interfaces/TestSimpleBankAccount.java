package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {

        AccountHolder andreaRossi = new AccountHolder("Andrea", "Rossi", 1);
        AccountHolder alexBianchi = new AccountHolder("Alex", "Bianchi", 2);

        SimpleBankAccount andreaRossiAccount = new SimpleBankAccount(andreaRossi.getUserID(), 1000);
        SimpleBankAccount alexBianchiAccount = new SimpleBankAccount(alexBianchi.getUserID(), 100);

        andreaRossiAccount.deposit(1, 250);
        andreaRossiAccount.depositFromATM(1, 3000);
        andreaRossiAccount.withdraw(1, 95);
        andreaRossiAccount.withdrawFromATM(1, 655);

        alexBianchiAccount.deposit(2, 20);
        alexBianchiAccount.depositFromATM(2, 45);
        alexBianchiAccount.withdraw(2, 170);
        alexBianchiAccount.withdrawFromATM(2, 95);


        System.out.println(andreaRossiAccount.getBalance()); // 3.498
        System.out.println(alexBianchiAccount.getBalance()); // -102

        
        andreaRossiAccount.withdraw(3, 15);
        alexBianchiAccount.withdraw(5, 35);

        System.out.println(andreaRossiAccount.getBalance());
        System.out.println(alexBianchiAccount.getBalance());
    }
}
