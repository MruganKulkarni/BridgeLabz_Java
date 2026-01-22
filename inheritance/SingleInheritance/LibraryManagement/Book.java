package Inheritance.SingleInheritance.LibraryManagement;
public class Book {

    /*
     This class represents a book in the library management system.
     It serves as the superclass and contains general information
     about a book such as its title and publication year, which
     can be inherited by more specific classes.
    */

    // Stores book title
    protected String title;

    // Stores publication year
    protected int publicationYear;

    // Initializes book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Displays book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}
