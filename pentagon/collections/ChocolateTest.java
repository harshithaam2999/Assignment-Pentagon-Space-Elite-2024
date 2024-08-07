package pentagon.collections;

import java.util.ArrayList;
import java.util.List;

class Chocolate
{
	String name;
	String flavor;
	String towhome;
	double price;
	public Chocolate(String name,String flavor,String towhome,double price) 
	{
		super();
		this.name = name;
		this.flavor = flavor;
		this.towhome = towhome;
		this.price = price;
	}	
	void display() 
	{
		System.out.println("Name :" + this.name);
		System.out.println("Flavor : "+this.flavor);
		System.out.println("Towhome : " + this.towhome);
		System.out.println("Price : " + this.price);

	}
}
public class ChocolateTest {

	public static void main(String[] args)
	{
		Chocolate c1 = new Chocolate("Kitkat","Biscuit","Myself",50);
		Chocolate c2 = new Chocolate("Dairy Milk","Choco","Sister",150);
		Chocolate c3 = new Chocolate("Snickers","Peanuts","Brother",200);
		Chocolate c4 = new Chocolate("Munch","Crunch","Mother",100);
		
		List<Chocolate> chocolist = new ArrayList<Chocolate>();
		
		chocolist.add(c1);
		chocolist.add(c2);
		chocolist.add(c3);
		chocolist.add(c4);
		
		for(Chocolate c : chocolist)
		{
	      c.display();
	      System.out.println();
	      System.out.println("**********");
		}	
		chocolist.remove(c4);  //remove 
		
		System.out.println("After Removal is : ");
		System.out.println("=====================");
		
		for(Chocolate c : chocolist)
		{
	      c.display();
	      System.out.println();
	      System.out.println("**********");
		}	
		
		Chocolate c5 = new Chocolate("5 Star","Choco","Friends",250);
		
		chocolist.add(c5);
		
		System.out.println("After Removal is : ");
		
		System.out.println("=====================");
		
		for(Chocolate c : chocolist)
		{
	      c.display();
	      System.out.println();
	      System.out.println("**********");
		}	
		
	}

}
