import java.util.Scanner;
// creating a class Book with attributes title, author, and price.
class Book {
    String title;
    String author;
    double price;
    // method to display the book details.
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
// Main class
public class HandleBookDetails {
    public static void main(String[] args) {
        // creating an object of Book class
        Book book = new Book();
        // taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        book.title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        book.author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        book.price = sc.nextDouble();
        // calling the method to display the book details
        book.displayBookDetails();
        sc.close();
    }
}
