package pentagon.collections;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) 
	{
		List list = new ArrayList(); //arraylist is a class
		list.add("String"); //0
		list.add(123); //1
		list.add(new int[] {12,15,18});   //2 //one time intialization of array
		list.add('C'); //3
		System.out.println(list); //4
		
		int arr[] = (int[]) list.get(2);
		String str = (String) list.get(0);
		
		for(Object obj : list) 
		{
			
		}
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(12);
		list1.add(23);
		list1.add(45);
		list1.add(67);
		System.out.println(list1);
		

	}

}
