package JavaClassAndObject.Level1;

public class Book {

    /*
     * This class represents a Book with attributes such as title, author,
     * and price. It uses a constructor to initialize the book details
     * and provides a method to display the stored information.
     */

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        // Displaying book information
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C. Martin", 499);
        book.displayDetails();
    }
}
