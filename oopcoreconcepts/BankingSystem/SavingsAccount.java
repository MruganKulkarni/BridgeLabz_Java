package OOPCoreConcepts.BankingSystem;
public class SavingsAccount extends BankAccount {

    /*
     This class represents a savings account.
     It extends BankAccount and applies a fixed
     interest rate on the account balance.
    */

    // Interest rate for savings account
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Calculates interest for savings account
    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}
