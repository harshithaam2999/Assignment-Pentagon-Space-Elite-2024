package pentagon.collections;

import java.util.HashSet;

public class HashMapExample {

	public static void main(String[] args) 
	{
	
		HashSet<Integer> hash = new HashSet<>();
		
		hash.add(12);
		hash.add(34);
		hash.add(78);
		hash.add(69);
		hash.add(1);
		
		Object obj=new Object();
		System.out.println(obj.hashCode());
		
		System.out.println(hash.hashCode());
	}

}
