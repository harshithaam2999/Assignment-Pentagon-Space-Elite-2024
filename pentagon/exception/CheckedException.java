package pentagon.exception;

import java.io.IOException;

public class CheckedException 
{
    static void print()
    {
    	try 
    	{
    		throw new IOException(); //explict 
    	}
    	catch(IOException e) 
    	{
    		e.printStackTrace();
    	}
    	
    }
	public static void main(String[] args) throws IOException
	{
		System.out.println("Starting");
		CheckedException.print();
		System.out.println("Ending");

	}

}
