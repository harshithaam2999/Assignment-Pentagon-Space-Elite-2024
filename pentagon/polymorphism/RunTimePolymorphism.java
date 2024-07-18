package pentagon.polymorphism;


class House
{   
	void build() 
	{
		System.out.println("Buliding normal house with 2bhk without stairs");
	}
	
}
class DuplexHouse extends House
{
	@Override
	void build() 
	{  
		System.out.println("Implementing old house with new duplex house with 3 extra bedrooms with" + "with stairs");
	}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		House h = new House();
		h.build();
		
		DuplexHouse dh = new DuplexHouse();
		dh.build();	

	}

}
