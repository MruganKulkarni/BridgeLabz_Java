package Inheritance.SingleInheritance.LibraryManagement;
public class Author extends Book {

    /*
     This class represents an author-specific view of a book.
     It extends the Book class by adding author details while
     reusing the general book information through inheritance.
    */

    // Stores author name
    private String name;

    // Stores author biography
    private String bio;

    // Initializes author and book details using super
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Initialize Book attributes
        this.name = name;
        this.bio = bio;
    }

    // Displays complete book and author information
    @Override
    void displayInfo() {
        super.displayInfo(); // Display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }

    public static void main(String[] args) {
        // Creating Author object
        Author authorBook =
                new Author("Effective Java", 2018, "Joshua Bloch",
                        "Expert in Java best practices");

        // Displaying book and author details
        authorBook.displayInfo();
    }
}
