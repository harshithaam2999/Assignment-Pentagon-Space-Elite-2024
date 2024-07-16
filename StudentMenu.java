import java.util.Scanner;

public class StudentMenu 
{
	public static void main(String[] args)
	{
		Scanner scanner  = new Scanner(System.in);
		int choice;
		int marks1 = 0,marks2 = 0,marks3 = 0;
		String studentname;
		double percentage;
		
		do 
		{
			System.out.println("*****STUDENT MENU*****");
			System.out.println("1.Enter Student Details");
			System.out.println("2.View Total Marks");
			System.out.println("3.View Percentage");
			System.out.println("4.Check Eligiblity for Next year");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Student Name:");
			    scanner.nextLine();
			    studentname = scanner.nextLine();
			    System.out.print("Enter marks in subject 1 : ");
			    marks1=scanner.nextInt();
			    System.out.print("Enter marks in subject 2: ");
			    marks2=scanner.nextInt();
			    System.out.print("Enter marks in subject 3: " );
			    marks3=scanner.nextInt();
			    System.out.println("Student details Entered ");
			    break;
			    
			case 2:
                int totalMarks = marks1 + marks2 + marks3;
                System.out.println("Total Marks: " + totalMarks);
                break;   
                
			case 3:
                totalMarks = marks1 + marks2 + marks3;
                percentage = (totalMarks / 3.0);
                System.out.println("Percentage: " + percentage + "%");
                break;    
			    
			case 4:
                totalMarks = marks1 + marks2 + marks3;
                percentage = (totalMarks / 3.0);
                if (percentage < 35) {
                    System.out.println("Percentage: " + percentage + "%. Not eligible for next year.");
                } else {
                    System.out.println("Percentage: " + percentage + "%. Eligible for next year.");
                }
                break;
                
			case 5:
                System.out.println("Exiting program...");
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

        System.out.println();

    } while (choice != 5);

    scanner.close();
	}
}

