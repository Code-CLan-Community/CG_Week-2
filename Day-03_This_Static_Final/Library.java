

public class Library {
    static String libraryName = "VR Library Hub";
    String title;
    String author;
    final int isbn;

    Library(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Tittle Of Book : " + title);
        System.out.println("Author Name: " + author);
        System.out.println("ISBN Number: " + isbn);
        System.out.println();
        
    }

    // Method to display account details
    public static void displayLibraryname() {
        System.out.println("Library Name: " + libraryName);
    }

    public static void main(String[] args) {

        // Creating Library objects
        Library l1 = new Library("Java-The Complete Reference", "MC Graw's Hill", 1000);
        Library l2 = new Library("DSA - Advanced Programming", "Adam Drosdeck", 1001);
        displayLibraryname();
        System.out.println();
        // Displaying account details if the object is an instance of Library
        if (l1 instanceof Library) {
            l1.displayDetails();
        }
        // Displaying account details if the object is an instance of Library
        if (l2 instanceof Library) {
            l2.displayDetails();
        }
    }
}
