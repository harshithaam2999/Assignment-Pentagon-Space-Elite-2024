package pentagon.polymorphism;
class student
{
	int sid;
	String name;
	int age;
	int marks;
	char grade;
	
	
	void setdetails(int sid) 
	{
		this.sid=sid;
	}
	void setdeatils(int age,String name) 
	{
		this.age=age;
		this.name=name;
	}
	void setdetails(int marks,char grade) {
		this.marks=marks;
		this.grade=grade;
		
	}
	void display() 
	{
		System.out.println("Student ID is : "+sid);
		System.out.println("Student Name is : "+name);
		System.out.println("Studnt Age is : "+age);
		System.out.println("Student Marks is  :"+ marks);
		System.out.println("Student Grade is  :"+grade);
	}
}
public class StudentDetails {

	public static void main(String[] args) 
	{
		student s = new student();
		s.setdetails(62);
		s.setdeatils(25,"Harshitha");
		s.setdetails(85,'A');
		s.display();
		

	}

}
