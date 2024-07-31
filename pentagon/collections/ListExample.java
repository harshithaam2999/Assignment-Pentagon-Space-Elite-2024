package pentagon.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args)
	{
		List<String> names = new ArrayList<>();
		
		names.add("Sudeep"); //0
		names.add("Chandana"); //1
		names.add("Yash"); //2
		names.add("Puneeth Raj Kumar"); //3
		names.add("Radhika Pandith"); //4
		names.add("Harshitha"); //5
		names.add("Arpitha"); //6
		names.add("Harshitha");  //7 //list allows duplicate elements
		names.add("Dilip"); //8
		System.out.println(names);
		System.out.println(names.size());
		
		for (int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		
		
		System.out.println("With Enhanced for loop");
		for(String name : names) // syntax: for(String str : list)
		{
			name = names.get(0);
			name=names.get(7);
			name=names.get(8);
			System.out.println(names);
		}
		
	}

}
