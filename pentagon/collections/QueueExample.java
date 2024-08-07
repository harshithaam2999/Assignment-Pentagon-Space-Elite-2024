package pentagon.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args)
	{
		Queue<Integer> que = new ArrayDeque<>();
		
		que.add(23);
		que.add(45);
		que.add(56);
		que.add(78);
		
		System.out.println(que);
		System.out.println();
		System.out.println("Removing the element from the head");
		System.out.println();
		
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
	}

}
