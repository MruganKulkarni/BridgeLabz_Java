package ConstructorsAndAccessModifiers.Constructors;
public class LibraryBookSystem {

    /*
     This program represents a library book system where constructors
     initialize book details and methods manage borrowing functionality.
     It highlights clean initialization and controlled state changes.
    */

    String title;
    String author;
    boolean isAvailable;

    // Constructor initializes book details
    public LibraryBookSystem(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Borrows the book if available
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Displays book status
    public void displayBookStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + isAvailable);
    }

    public static void main(String[] args) {
        LibraryBookSystem book =
                new LibraryBookSystem("Effective Java", "Joshua Bloch");

        book.displayBookStatus();
        book.borrowBook();
        book.displayBookStatus();
    }
}
