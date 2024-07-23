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
		 
		 int a[] = {2,3,4,5};
		 try {
			 System.out.println(a[4]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) 
		 {
			 e.printStackTrace();
		 }
		  System.out.println(a[4]);
		  System.out.println("Ending");
		 

	}

}
