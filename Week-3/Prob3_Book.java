/* Problem 3: 
Create a Book class with title, author, and price. Demonstrate both 
default and parameterized constructors and display book details */

class Book {
    String title, author;
    double price;
    // Default constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
public class Prob3_Book {
    public static void main(String[] args) {
        Book b1 = new Book(); // default constructor
        Book b2 = new Book("Inspiring Thoughts", "A.P.J Abdul Kalam", 499.99);
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}
