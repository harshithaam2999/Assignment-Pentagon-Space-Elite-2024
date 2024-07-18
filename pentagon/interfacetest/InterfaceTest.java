package pentagon.interfacetest;

interface FlightBooking
{
	//abstract void checkavailability();
	void checkavailability();
	static void display()
	{
		System.out.println("checking flights availability ");
	}
	
}
class AirAsia implements FlightBooking
{

	@Override
	public void checkavailability() {
		System.out.println("AirAsia Flights are available on 18-07-2024 ");
		
	}
	
}
class Indigo implements FlightBooking{

	@Override
	public void checkavailability() {
		System.out.println("Indigo Flights are available on 18-07-2024 ");
		
	}	
}
public class InterfaceTest {

	public static void main(String[] args) {
	
		AirAsia asia = new AirAsia();
		asia.checkavailability();
		FlightBooking.display();
		
		Indigo go = new Indigo();
		go.checkavailability();

	}

}
