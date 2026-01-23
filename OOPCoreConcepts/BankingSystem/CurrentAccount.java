package OOPCoreConcepts.BankingSystem;
public class CurrentAccount extends BankAccount {

    /*
     This class represents a current account.
     It extends BankAccount and does not apply
     interest on the account balance.
    */

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Current accounts do not earn interest
    @Override
    public double calculateInterest() {
        return 0;
    }
}
