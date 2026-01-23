package Inheritance.HierarchicalInheritance.BankAccountTypes;
public class BankAccount {

    /*
     This class represents a generic bank account in a banking system.
     It acts as the superclass in a hierarchical inheritance structure
     and contains common attributes such as account number and balance
     that are shared by all account types.
    */

    // Stores account number
    protected String accountNumber;

    // Stores account balance
    protected double balance;

    // Initializes bank account details
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
