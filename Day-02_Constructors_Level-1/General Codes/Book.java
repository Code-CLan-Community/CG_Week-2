
import java.util.*;

class BookManage {
    // attributes
    private String title;
    private String author;
    private double price;

    // default constructor
    public BookManage() {
        title = "Kalyug Ka Gandhi";
        author = "Pratik";
        price = 5000.0;
    }

    // parameterized constructor
    public BookManage(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();
        // creating object of BookManage class
        BookManage b1 = new BookManage(title, author, price);
        b1.display(); // calling display method
        sc.close();
    }
    
}