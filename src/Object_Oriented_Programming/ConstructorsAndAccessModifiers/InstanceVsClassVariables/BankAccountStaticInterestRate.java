package ConstructorsAndAccessModifiers.InstanceVsClassVariables;
public class BankAccountStaticInterestRate {

    /*
     This program demonstrates how a static variable can be used
     to represent a common interest rate shared by all bank accounts,
     while each account maintains its own balance as an instance variable.
    */

    static double interestRate = 4.5;
    double balance;

    // Constructor initializes account balance
    public BankAccountStaticInterestRate(double balance) {
        this.balance = balance;
    }

    // Calculates interest based on static rate
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public static void main(String[] args) {
        BankAccountStaticInterestRate acc1 =
                new BankAccountStaticInterestRate(10000);
        BankAccountStaticInterestRate acc2 =
                new BankAccountStaticInterestRate(20000);

        System.out.println("Interest for Account 1: " + acc1.calculateInterest());
        System.out.println("Interest for Account 2: " + acc2.calculateInterest());
    }
}
