package OOPCoreConcepts.BankingSystem;
public class BankingDemo {

    public static void main(String[] args) {

        // Polymorphic account references
        BankAccount savings =
                new SavingsAccount("SB1001", 50000);

        BankAccount current =
                new CurrentAccount("CA2001", 30000);

        // Displaying savings account details
        savings.displayAccountInfo();
        System.out.println();

        // Displaying current account details
        current.displayAccountInfo();
    }
}
