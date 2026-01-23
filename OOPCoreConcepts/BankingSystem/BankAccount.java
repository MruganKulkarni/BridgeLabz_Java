package OOPCoreConcepts.BankingSystem;
public abstract class BankAccount {

    /*
     This abstract class represents a generic bank account.
     It encapsulates common account details such as account number
     and balance, and defines abstract operations that must be
     implemented by specific account types.
    */

    // Stores account number
    private String accountNumber;

    // Stores current balance
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    // Deposits amount into account
    public void deposit(double amount) {
        balance += amount;
    }

    // Displays account summary
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
    }
}
