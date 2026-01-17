package Inheritance.HierarchicalInheritance.BankAccountTypes;
public class SavingsAccount extends BankAccount {

    /*
     This class represents a savings account.
     It extends the BankAccount class by adding
     interest-related information specific to savings accounts.
    */

    // Stores interest rate
    private double interestRate;

    // Initializes savings account details
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Initialize base account details
        this.interestRate = interestRate;
    }

    // Displays account type
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
