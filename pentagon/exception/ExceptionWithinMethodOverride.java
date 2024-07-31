package pentagon.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent
{
	void print() throws IOException
	{
		System.out.println("Parent Exception");
	}
}
class Child extends Parent
{
	@Override
	void print()
	{
		System.out.println("Child exception");
	}
}
public class ExceptionWithinMethodOverride 
{

	public static void main(String[] args)
	{
        // System.out.println("Hello World");
	}

}
