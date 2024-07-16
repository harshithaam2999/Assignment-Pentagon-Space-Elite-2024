import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string 1:");
		String s1=sc.next();
		
		//sc.nextLine();
		
		System.out.println("Enter string 2:");
		String s2=sc.nextLine();
		
		System.out.println("String 1 is "+s1);
		System.out.println("String 2 is "+s2);

	}

}
