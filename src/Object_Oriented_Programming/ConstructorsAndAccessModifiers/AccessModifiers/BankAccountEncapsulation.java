package ConstructorsAndAccessModifiers.AccessModifiers;
public class BankAccountEncapsulation {

    /*
     This program demonstrates encapsulation using private variables
     and public getter and setter methods. It ensures controlled access
     to sensitive data while maintaining data integrity.
    */

    // Private variables to protect account data
    private String accountHolderName;
    private double balance;

    // Constructor initializes account details
    public BankAccountEncapsulation(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter to deposit money with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        BankAccountEncapsulation account =
                new BankAccountEncapsulation("Amit", 5000);

        account.deposit(2000);
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
    }
}
