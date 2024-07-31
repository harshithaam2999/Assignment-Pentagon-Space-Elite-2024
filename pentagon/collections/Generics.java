package pentagon.collections;

class StoreData<T>
{
	T Data;
	void add(T Data) 
	{
	    this.Data=Data;
	}
}
public class Generics 
{
    public static void main(String[] args)
	{
	  StoreData<String> st = new StoreData<String>();
	  st.add("Harshitha");
	  
	  System.out.println(st.Data);
	  
	  StoreData<Integer> st1 = new StoreData<Integer>();
	  st1.add(238426);
	  
	  System.out.println(st1.Data);  

	}

}
