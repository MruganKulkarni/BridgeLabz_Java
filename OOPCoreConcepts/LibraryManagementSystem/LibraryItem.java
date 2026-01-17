package OOPCoreConcepts.LibraryManagementSystem;
public abstract class LibraryItem {

    /*
     This abstract class represents a generic item in a library system.
     It encapsulates common attributes such as item ID and title, and
     defines an abstract method to calculate late fees, which must be
     implemented by specific library item types.
    */

    // Unique library item ID
    private int itemId;

    // Title of the library item
    private String title;

    public LibraryItem(int itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    // Getter for item ID
    public int getItemId() {
        return itemId;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Abstract method to calculate late fee
    public abstract double calculateLateFee(int daysLate);

    // Displays common item details
    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
    }
}
