package Inheritance.HierarchicalInheritance.BankAccountTypes;
public class CheckingAccount extends BankAccount {

    /*
     This class represents a checking account.
     It extends the BankAccount class by adding
     withdrawal-related limitations specific to checking accounts.
    */

    // Stores withdrawal limit
    private double withdrawalLimit;

    // Initializes checking account details
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Initialize base account details
        this.withdrawalLimit = withdrawalLimit;
    }

    // Displays account type
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
