package pentagon.exception;

//package penta.exception;

class DoNotDisturbException extends Exception
{

	DoNotDisturbException(String message)
	{
		super(message);
	}
}
class Study
{
	boolean phonering=true;
	void checkPhone() throws DoNotDisturbException 
	{
		System.out.println("Started Studying");
		
		if(phonering==true)
		{
			throw new DoNotDisturbException("Phone is ringing, Unable to study");
		}
		else
		{
			System.out.println("No disturbance");
		}
	}
}

public class CustomExceptions {

	public static void main(String[] args) throws DoNotDisturbException {

		Study s= new Study();
		s.checkPhone();

	}

}