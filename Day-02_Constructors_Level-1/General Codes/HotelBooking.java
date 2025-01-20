import java.util.*;
class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Unknown";
        this.nights = 0;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the guest name: ");
            String guestName = sc.nextLine();
            System.out.println("Enter the room type: ");
            String roomType = sc.nextLine();
            System.out.println("Enter the number of nights: ");
            int nights = sc.nextInt();
            HotelBooking h1 = new HotelBooking(guestName, roomType, nights);
            h1.display();
            sc.close();
        }
    }