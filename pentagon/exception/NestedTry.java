package pentagon.exception;

public class NestedTry {

	public static void main(String[] args)
	{
		System.out.println("Welcome To ");
		try {
			int num = 40/0;
			try {
				int arr[] = new int[5];
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				e.printStackTrace();
			}
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Pentagon Space");
		
		

	}

}
