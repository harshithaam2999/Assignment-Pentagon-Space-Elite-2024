
public class Recursion {

	static int  fact(int i)
	{
		if(i>1) {
			
			return i*fact(i-1);
		}
		else
		return 1;
	}
	public static void main(String[] args) 
	{
		System.out.println(fact(5));
		

	}

}
