class Parent{
	String name;
	int parent_age;
	Parent(String name,int parent_age)
	{
		this.name=name;
		this.parent_age=parent_age;
		System.out.println("Parent calling");
	}
}
class Child extends Parent
{

	String cname;
	String pname;
	Child(String cname,String pname, int parent_age) {
		super(pname, parent_age);
	
		this.cname=cname;
		this.pname=pname;
}
	void display() 
	{
		System.out.println("Parent name :" + pname);
		System.out.println("Parent age : " + parent_age);
		System.out.println("Child name : " + cname);
	}
	
}
public class ChainingWithSuper
{
	public static void main(String[] args) 
	{
		Child c = new Child("Harshu","Harshitha",25);
		c.display();
	}

}
