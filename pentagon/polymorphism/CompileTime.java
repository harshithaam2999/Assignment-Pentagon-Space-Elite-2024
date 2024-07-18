package pentagon.polymorphism;


class Addition
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers: " + c);
	}
	void add(int a,float b) {
		int c=(int)(a+b);
		System.out.println("Addition of two numbers with same parameter and different datatype : +c");
	}
	void add(int a,int b,int c) 
	{
		int result = (a+b+c);
		System.out.println("Addition of 3 Numbers : POV with three parameter " + result);
		
	}
}
public class CompileTime 
{

	public static void main(String[] args) 
	{
		Addition a = new Addition();
		{
			a.add(12,15);
			a.add(15,36,18);
			a.add(189,159,147);
			
		}

	}

}


