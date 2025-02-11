class Book {
    protected String title;
    protected int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title = " + title + "\nPublication Year = " + publicationYear);
        System.out.println();
    }
}
// Subclass: Author
class Author extends Book {
    private String name;
    private String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call to superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Author Info: = " + name + "\nBio = " + bio);
        System.out.println();
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("Crack Campus", 2025, "Hariom Sharma", "Aptitude Publications");
        // Call displayInfo to show book and author details
        author.displayInfo();
    }
}