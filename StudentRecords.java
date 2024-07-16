import java.util.Scanner;

public class StudentRecords {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		String StudentName;
		int[] marks = new int[5];
		int totalmarks = 0;
		double percentage;
		
		System.out.println("Enter Student's Name : ");
        StudentName = scanner.nextLine();
        System.out.println("Enter marks for 5 Subjects : ");
        for(int i=0;i<5;i++) 
        {
        	System.out.println("subject" + (i+1) + " : ");
        	marks[i] = scanner.nextInt();
        	totalmarks += marks[i];
        }
        percentage = totalmarks/5.0;
        System.out.println("\n Student Details:");
        System.out.println("Name:"+ StudentName);
        System.out.println("TotalMarks:" + totalmarks);
        System.out.println("Percentage:" +percentage);
        
        System.out.println("*****STUDENT RECORDS*****");
        System.out.println("1.View Total Marks");
        System.out.println("2.View Percentage");
        System.out.println("3.Check Eligibility for Next year");
        System.out.println("4.Exit the program");
        
        int choice;
        do 
        {
        	System.out.println("Enter your choice:");
        	choice=scanner.nextInt();
        	switch(choice) 
        	{
        	case 1:
        		      System.out.println("TotalMarks: "+ totalmarks);
        		      break;
        	case 2:
        		      System.out.println("Percentage:"+ percentage);
        		      break;
        	case 3:   
        		      if(percentage>=35) 
        		      {
        		    	  System.out.println("Eligible for next year");
        		      }
        		      else
        		      {
        		    	  System.out.println("Not Eligible for next year");
        		      }
        		      break;
        	case 4:
        		      System.out.println("Exit");
        		      break;
        		      
            default: 
            	      System.out.println("Invalid choice");	
                      break;
        		      
        	}
        }
        while(choice!=4);
        scanner.close();
        
	}

}
