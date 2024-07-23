package pentagon.abstraction;


abstract class Dishes
{
	void cooking() 
	{

	}
}
public class AnonymousInnerClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Dishes d = new Dishes() 
		{
			void cooking() 
			{
				
				System.out.println("Preparing Biriyani ");
			}
		};   //it should end with semicolon
		d.cooking();

	}

}
