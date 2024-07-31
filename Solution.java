import java.util.Scanner;
public class Solution 
{

	 public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	        
	        // Read integer
	        int i = scan.nextInt();
	        
	        // Read double
	        double d = scan.nextDouble();
	        
	        // Consume the leftover newline character after reading double
	        scan.nextLine(); // This is important to avoid issues with reading the string
	        
	        // Read string
	        String s = scan.nextLine();
	        
	        // Output in the specified format
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        
	        scan.close();
	    }
	}
