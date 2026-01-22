package OOPCoreConcepts.RideHailingApplication;
public interface GPS {

    /*
     This interface represents GPS functionality used in a ride-hailing
     application. It defines behaviors related to tracking and updating
     the current location of a vehicle during a ride.
    */

    // Returns current GPS location
    String getCurrentLocation();

    // Updates GPS location
    void updateLocation(String newLocation);
}
