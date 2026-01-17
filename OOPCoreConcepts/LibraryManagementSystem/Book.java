package OOPCoreConcepts.LibraryManagementSystem;
public class Book extends LibraryItem {

    /*
     This class represents a book in the library.
     It extends LibraryItem and applies book-specific
     rules for calculating late fees.
    */

    // Late fee per day for books
    private static final double LATE_FEE_PER_DAY = 5.0;

    public Book(int itemId, String title) {
        super(itemId, title);
    }

    // Calculates late fee for books
    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * LATE_FEE_PER_DAY;
    }
}
