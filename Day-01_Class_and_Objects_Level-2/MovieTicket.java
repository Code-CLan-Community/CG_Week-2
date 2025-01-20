import java.util.*;

public class MovieTicket {
    
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket Booked Successfully");
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
    }
}

class MainMovieTicket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Movie Name: ");
        String movieName = sc.nextLine();
        System.out.println("Enter Seat Number: ");
        int seatNumber = sc.nextInt();
        System.out.println("Enter Price: ");
        double price = sc.nextDouble();

        MovieTicket mt = new MovieTicket(movieName, seatNumber, price);
        mt.displayDetails();
        sc.close();
    }
}