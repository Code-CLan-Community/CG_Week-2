public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    public LibraryBookSystem(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Borrow method
    public String borrow() {
        if (available) {
            available = false;
            return "You have successfully borrowed '" + title + "'.";
        } else {
            return "Sorry, '" + title + "' is currently unavailable.";
        }
    }

    // Display LibraryLibraryBookSystem details
    public void displayDetails() {
        String availability = available ? "Available" : "Unavailable";
        System.out.println("'" + title + "' by " + author + ", Price: $" + price + " (" + availability + ")");
    }

    // Main method for testing
    public static void main(String[] args) {
        LibraryBookSystem LibraryLibraryBookSystem1 = new LibraryBookSystem("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);
        LibraryBookSystem LibraryLibraryBookSystem2 = new LibraryBookSystem("1984", "George Orwell", 8.99, false);

        LibraryLibraryBookSystem1.displayDetails();
        System.out.println(LibraryLibraryBookSystem1.borrow());
        LibraryLibraryBookSystem1.displayDetails();

        LibraryLibraryBookSystem2.displayDetails();
        System.out.println(LibraryLibraryBookSystem2.borrow());
    }
}
