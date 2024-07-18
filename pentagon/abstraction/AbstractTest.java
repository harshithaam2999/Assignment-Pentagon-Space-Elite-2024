package pentagon.abstraction;

abstract class Operation
{
	abstract int calculate(int a,int b);
}
class Addition extends Operation{

	@Override
	int calculate(int a, int b) 
	{
		return a+b;
	}
	
}
class Subtraction extends Operation{

	@Override
	int calculate(int a, int b)
	{
		return a-b;
	}
	
}
class Multiplication extends Operation{

	@Override
	int calculate(int a, int b) 
	{
		return a*b;
	}
	
}
public class AbstractTest
{

	public static void main(String[] args)
	{
		Addition add = new Addition();
		System.out.println("Addition of two numbers is : " + add.calculate(15, 18));
		
		Subtraction sub = new Subtraction();
		System.out.println("Subtraction of two numbers is : " + sub.calculate(45, 25));
		
		Multiplication  mul = new Multiplication();
		System.out.println("Multiplication of two numbers is : " + mul.calculate(20, 3));
		
	}

}
