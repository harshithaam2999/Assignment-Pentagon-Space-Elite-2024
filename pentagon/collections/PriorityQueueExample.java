package pentagon.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(45);
		pq.add(23);
		pq.add(12);
		pq.add(89);
		pq.add(10);
		pq.add(95);
		pq.add(56);
		//pq.add(null); //pq will not allow null 
		
		pq.offer(13);  //offer method is also same as add method
		System.out.println(pq);
			
		//System.out.println(pq);
		
		System.out.println("Removing head on priority");
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());	
		
		//System.out.println(pq.poll());

	}

}
