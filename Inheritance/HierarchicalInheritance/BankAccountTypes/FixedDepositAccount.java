package Inheritance.HierarchicalInheritance.BankAccountTypes;
public class FixedDepositAccount extends BankAccount {

    /*
     This class represents a fixed deposit account.
     It extends the BankAccount class by adding
     deposit duration information specific to fixed deposits.
    */

    // Stores deposit duration in months
    private int depositDuration;

    // Initializes fixed deposit account details
    public FixedDepositAccount(String accountNumber, double balance, int depositDuration) {
        super(accountNumber, balance); // Initialize base account details
        this.depositDuration = depositDuration;
    }

    // Displays account type
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}
