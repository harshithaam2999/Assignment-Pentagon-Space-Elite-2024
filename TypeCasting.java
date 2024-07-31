class parent1
{
	void printData() 
	{
		System.out.println("Calling parent class method");
	}
	
}
class child1 extends parent1
{
	void printData() 
	{
		System.out.println("calling child class method");
	}
	void display() 
	{
		System.out.println("child property");
	}
}
public class TypeCasting 
{
	public static void main(String[] args) 
	{
		parent1 p = new child1();
		p.printData();
		
		child1 c = (child1)p;
		c.display();
		c.printData();
	}

}
