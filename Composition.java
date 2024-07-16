class Heart
{
	void pump() 
	{
		System.out.println("Heart is pumping");
	}
}
class Human
{
	String gender="female";
	Heart h;
	Human()
	{
		h=new Heart();
	}
}
public class Composition
{
	public static void main(String[] args)
	{
		Human human = new Human();
		System.out.println("Gender is : " + human.gender );
		human.h.pump();
	}
}
