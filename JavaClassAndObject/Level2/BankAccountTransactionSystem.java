package JavaClassAndObject.Level2;

public class BankAccountTransactionSystem {

    /*
     * This class models a Bank Account with details such as account holder,
     * account number, and balance. It supports deposit and withdrawal
     * operations while ensuring balance integrity.
     */

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccountTransactionSystem(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Adding amount to balance
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        // Deducting amount if sufficient balance exists
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
        // Display
    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccountTransactionSystem account = new BankAccountTransactionSystem("Ravi", 100234, 5000);
        account.deposit(1500);
        account.withdraw(2000);
        account.displayAccountDetails();
    }
}
