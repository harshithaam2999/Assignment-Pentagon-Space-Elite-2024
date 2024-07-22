package pentagon.interfacetest;


//Interface for Flight operations
interface Flight {
 void bookSeat(int numSeats);
 int checkAvailability();
 int remainingSeats();
 double pricePerSeat();
}

//Class implementing Flight interface
class FlightBookings implements Flight
{
 private String airline;
 private String destination;
 private int totalSeats;
 private int bookedSeats;
 private double pricePerSeat;

 // Constructor
 public FlightBookings(String airline, String destination, int totalSeats, double pricePerSeat) 
 {
     this.airline = airline;
     this.destination = destination;
     this.totalSeats = totalSeats;
     this.bookedSeats = 0; // Initially no seats booked
     this.pricePerSeat = pricePerSeat;
 }

 // Method to book seats
 @Override
 public void bookSeat(int numSeats) {
     if (numSeats <= checkAvailability()) {
         bookedSeats += numSeats;
         System.out.println(numSeats + " seats booked successfully for " + airline + " to " + destination);
     } else {
         System.out.println("Sorry, only " + checkAvailability() + " seats available.");
     }
 }

 // Method to check available seats
 @Override
 public int checkAvailability() {
     return totalSeats - bookedSeats;
 }

 // Method to get remaining seats
 @Override
 public int remainingSeats() {
     return checkAvailability();
 }

 // Method to get price per seat
 @Override
 public double pricePerSeat() {
     return pricePerSeat;
 }

 // Getters and setters (optional for encapsulation)
 public String getAirline() {
     return airline;
 }

 public void setAirline(String airline) {
     this.airline = airline;
 }

 public String getDestination() {
     return destination;
 }

 public void setDestination(String destination) {
     this.destination = destination;
 }

 public int getTotalSeats() {
     return totalSeats;
 }

 public void setTotalSeats(int totalSeats) {
     this.totalSeats = totalSeats;
 }

 public int getBookedSeats() {
     return bookedSeats;
 }

 public void setBookedSeats(int bookedSeats) {
     this.bookedSeats = bookedSeats;
 }

 public double getPricePerSeat() {
     return pricePerSeat;
 }

 public void setPricePerSeat(double pricePerSeat) {
     this.pricePerSeat = pricePerSeat;
 }
}

//Test class for FlightBooking
public class FlighBookings 
{
 public static void main(String[] args) 
 {
     // Create a flight instance
     FlightBookings flight1 = new FlightBookings("Indigo", "Asia", 100, 250.0);

     // Book seats
     flight1.bookSeat(5);
     flight1.bookSeat(10);

     // Display details
     System.out.println("***** Flight Details *****");
     System.out.println("Airline: " + flight1.getAirline());
     System.out.println("Destination: " + flight1.getDestination());
     System.out.println("Total Seats: " + flight1.getTotalSeats());
     System.out.println("Booked Seats: " + flight1.getBookedSeats());
     System.out.println("Available Seats: " + flight1.remainingSeats());
     System.out.println("Price per Seat: $" + flight1.pricePerSeat());
 }
}

