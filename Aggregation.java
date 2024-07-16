
class Address
{
	String city;
	String state;
	String Country;
	
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.Country=country;
	}
}

class Student{
	String name;
	int marks;
	Address add;
	
	Student(String name,int marks,Address add){
		this.name=name;
		this.marks=marks;
		this.add=add;
	}
	
}
public class Aggregation {

	public static void main(String[] args)
	{
		Address add = new Address("Mysore","karnataka","india");
		
		Student stu = new Student("Arpitha",500,add);
		
		System.out.println("Student name:" +stu.name);
		
		System.out.println("Student marks:" +stu.marks);
		
		System.out.println("Student Address : ");
		
		System.out.println("===============");
		
		System.out.println("Student City :"+stu.add.city);
		System.out.println("Student state :"+stu.add.state);
		System.out.println("Student country :"+stu.add.Country);
		
		
		
	}

}
