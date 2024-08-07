package pentagon.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample2 {

	public static void main(String[] args) 
	{
		
		PriorityQueue<String> names = new PriorityQueue<>();
		names.add("Chandana");
		names.add("Harshitha");
		names.add("Divya");
		names.add("Bhuvana");
		names.add("Arpitha");

		System.out.println(names);
		System.out.println("Removing");
		System.out.println();
		
		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());
		System.out.println(names.poll());
	}

}
