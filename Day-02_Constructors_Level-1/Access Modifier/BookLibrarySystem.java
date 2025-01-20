class Book {
    // Public variable
    public String ISBN;

    // Protected variable
    protected String title;

    // Private variable
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends Book {
    private double fileSize; // File size in MB

    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display eBook details
    @Override
    public void displayDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Accessible because it's public
        System.out.println("Title: " + title); // Accessible because it's protected
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main class to test the implementation
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("978-3-16-148410-0", "The Great Novel", "John Doe");
        book.displayDetails();
        System.out.println();

        // Modify and access author name
        book.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + book.getAuthor());
        System.out.println();

        // Create an EBook object
        EBook eBook = new EBook("978-1-23-456789-7", "Digital Transformation", "Alice Brown", 2.5);
        eBook.displayDetails();
    }
}
