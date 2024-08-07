package pentagon.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args)
	{
	    Set<String> set = new HashSet<>();
	    set.add("Aashika");
	    set.add("Nidhi");
	    set.add("Varsha");
	    set.add("Bhoomika");
	    set.add("Anamika");
	    set.add("Harshika");
	    set.add("Pallavi");
	    set.add("Aashika");
	    set.add("Madhu");
	    set.add("Nisha");
	    //set.add(null);
	    
	    for(String name : set)
	    {
	    	System.out.println(name);
	    }
	    System.out.println(set.remove("Aashika"));
	    System.out.println();
	    for(String name:set)
	    {
	    	System.out.println(name);
	    }
	    //to check wheather the element is present inside set
	    System.out.println();
	    System.out.println(set.contains("Naveen"));
	    
	    System.out.println();
	    
	    List<Integer> list = List.of(12, 34, 21,12,45,34);
	    System.out.println(list);
	    
	    Set<Integer> set1 = new HashSet<>(list);
	    
	    System.out.println("set");
	    System.out.println(set1);
	}
}


