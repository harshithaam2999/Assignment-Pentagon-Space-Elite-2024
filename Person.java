
public class Person
{
   private String name;
   private int age;
   private double height;
   
   //constructor to initialize instance variables
   public Person(String name,int age,double height) {
	   this.name=name;
	   this.age=age;
	   this.height=height;
   }
   //method to display information of person
   public void displayInfo() {
	   System.out.println("Name is:" + name);
	   System.out.println("Age is:" + age);
	   System.out.println("Height is:" + height);
	   
	   
   }
   public static void main (String[] args) {
	   //creating instance of person class
	   Person p1=new Person("Harshitha",65,5.7);
	   Person p2=new Person("Yashu",75,5.9);
	   
	   //calling instance method to display information
	   p1.displayInfo();
	   System.out.println();
	   p2.displayInfo();
	   
   }
   
}
