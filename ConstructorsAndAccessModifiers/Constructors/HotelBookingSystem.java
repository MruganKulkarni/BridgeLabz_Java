package ConstructorsAndAccessModifiers.Constructors;
public class HotelBookingSystem {

    /*
     This program simulates a hotel booking system using multiple constructors.
     It demonstrates default, parameterized, and copy constructors to manage
     different booking initialization scenarios.
    */

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBookingSystem() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    public HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBookingSystem(HotelBookingSystem booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Displays booking details
    public void displayBookingDetails() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBookingSystem booking1 =
                new HotelBookingSystem("John", "Deluxe", 3);

        HotelBookingSystem booking2 =
                new HotelBookingSystem(booking1);

        booking1.displayBookingDetails();
        System.out.println();
        booking2.displayBookingDetails();
    }
}
