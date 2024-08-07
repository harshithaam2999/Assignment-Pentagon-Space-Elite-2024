package pentagon.collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

class Food
{
	String type;
	String foodmenu;
	Float price;
	public Food(String type, String foodmenu, float price)
	{
		super();
		this.type = type;
		this.foodmenu = foodmenu;
		this.price = price;
		
		
	}
	void display() 
	{
		
		System.out.printf(this.type+"\t\t\t",this.foodmenu+"\t\t\t",this.price+"\t\t\t\n");
	}
	
}

public class LinkedHashSetExample
{
	public static void main(String args[]) 
	{
		Food f1 = new Food ("Non-veg","Tandoori chicken",350);
		Food f2 = new Food ("veg","P Butter Masala",450);
		Food f3 = new Food ("Non-veg","chicken tikka",550);
		Food f4 = new Food ("veg","Roti",350);
		LinkedHashSet<Food> lhs = new LinkedHashSet<>();
		
		Collections.addAll(lhs, f1,f2,f3,f4);
		
		Iterator<Food> itr = lhs.iterator();
		
		System.out.println();
		
		System.out.println("--------------------------------------------------------------------");
		while(itr.hasNext())
		{
			Food food=itr.next();
			food.display();
		}
		
		
		
	}
}

