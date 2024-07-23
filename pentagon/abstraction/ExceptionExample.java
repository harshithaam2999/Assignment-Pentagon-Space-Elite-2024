package pentagon.abstraction;

public class ExceptionExample {

	public static void main(String[] args)
	{
		System.out.println("starting");
		try
		   {
			 int num = 4/0;
		   }
		 catch(Exception e)
		 {
			e.printStackTrace();
		 }
		
		  System.out.println("Ending");
		 

	}

}
