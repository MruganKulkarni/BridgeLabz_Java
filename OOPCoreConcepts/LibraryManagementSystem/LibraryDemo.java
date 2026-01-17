package OOPCoreConcepts.LibraryManagementSystem;
public class LibraryDemo {

    public static void main(String[] args) {

        // Polymorphic library item references
        LibraryItem book =
                new Book(301, "Clean Code");

        LibraryItem magazine =
                new Magazine(302, "Tech Monthly");

        // Displaying book details and late fee
        book.displayItemDetails();
        System.out.println("Late Fee (4 days): " + book.calculateLateFee(4));
        System.out.println();

        // Displaying magazine details and late fee
        magazine.displayItemDetails();
        System.out.println("Late Fee (4 days): " + magazine.calculateLateFee(4));
    }
}
