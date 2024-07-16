class Father
{
	String name = "Mukesh";
	void house() 
	{
		System.out.println("Having 3BHK Flat");
	}
}
class Son extends Father
{
	String name = "Ananth";
	void car()
	{
		System.out.println("Having car");
		System.out.println("Name is : " + name);
		System.out.println("Name is : " + super.name); //super is used for differentiate child and parent properties if they have same name
	}
	
}
public class SingleLevel {

	public static void main(String[] args)
	{
	    Son s = new Son();
	    
	    s.house();
	    s.car();

	}

}
