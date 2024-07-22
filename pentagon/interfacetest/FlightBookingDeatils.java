package pentagon.interfacetest;


interface FlightBooking1
{
	void checkavailability();
	void setPassengersDetails(String passengerName,String BookingDetails);
	String setPassengerDetails();
	static void display() {
		//System.out.println("Checking flights availability....");
	}
}
class AirAsia1 implements FlightBooking
{
	String passengerName;
	String BookingDetails;	
	
	@Override
	public void checkavailability() 
	{
		System.out.println("AirAsia Flights are available on 19-07-2024");
	}

	public void setPassengersDetails(String passengerName, String BookingDetails) 
	{
		this.passengerName=passengerName;
		this.BookingDetails=BookingDetails;	
	}

	public String getPassengerDetails() 
	{
	    return "Passenger Name : " + passengerName 
	    		+ " Booking details: \n"
	    		+ BookingDetails;
	}
	
}

class Indigo1 implements FlightBooking
{
    String passengerName;
    String BookingDetails;
    
	@Override
	public void checkavailability()
	{
		System.out.println("Indigo Flights are available on 19-07-2024 ");
		
	}

	public void setPassengersDetails(String passengerName, String BookingDetails) 
	{
		this.passengerName=passengerName;
		this.BookingDetails=BookingDetails;
		
	}

	public String getPassengerDetails()
	{
	
		return "Passenger Name : \n " + passengerName  + "Booking details : \n " 
				+ BookingDetails;
	}
}
	
public class FlightBookingDeatils
{

	public static void main(String[] args) 
	{
		AirAsia1 asia = new AirAsia1();
		asia.checkavailability();
		asia.setPassengersDetails("Harshitha","Seat 12A,Business Class");
		
		System.out.println(asia.getPassengerDetails());
		
		//FlightBooking.display();
		
		Indigo1 go = new Indigo1();
		go.checkavailability();
		go.setPassengersDetails("Arpitha" ,"Seat 25B,Economy Class");
		System.out.println(go.getPassengerDetails());
		
	}

}
