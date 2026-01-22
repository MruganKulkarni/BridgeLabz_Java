package ConstructorsAndAccessModifiers.Constructors;

public class BookConstructorDemo {

    /*
     This program demonstrates the use of default and parameterized constructors
     in a Book class. The goal is to show how objects can be initialized with
     either default values or user-provided values while keeping object creation
     flexible and readable.
    */

    String title;
    String author;
    double price;

    // Default constructor initializes with predefined values
    public BookConstructorDemo() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    // Parameterized constructor initializes using provided values
    public BookConstructorDemo(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Displays book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        BookConstructorDemo defaultBook = new BookConstructorDemo();
        BookConstructorDemo customBook =
                new BookConstructorDemo("Java Basics", "James Gosling", 499.99);

        defaultBook.displayBookDetails();
        System.out.println();
        customBook.displayBookDetails();
    }
}
