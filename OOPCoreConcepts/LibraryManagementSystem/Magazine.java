package OOPCoreConcepts.LibraryManagementSystem;
public class Magazine extends LibraryItem {

    /*
     This class represents a magazine in the library.
     It extends LibraryItem and applies a different
     late fee calculation compared to books.
    */

    // Late fee per day for magazines
    private static final double LATE_FEE_PER_DAY = 3.0;

    public Magazine(int itemId, String title) {
        super(itemId, title);
    }

    // Calculates late fee for magazines
    @Override
    public double calculateLateFee(int daysLate) {
        return daysLate * LATE_FEE_PER_DAY;
    }
}
