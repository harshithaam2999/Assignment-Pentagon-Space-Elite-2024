
public class Employee1
{
	    int empid;
	    String ename; //instance variable
	    double salary;
	    
	    public Employee1(int empid, String ename, double salary) //local variables
	    {
	    	this.empid=empid;
	    	this.ename=ename;
	    	this.salary=salary;
	    	
	    }
	    public void getDetails()
	    {
	    	System.out.println("Empid :" + empid);
	    	System.out.println("empname :" + ename);
	    	System.out.println("salary :" + salary);
	    }
	    Employee1(Employee1 e1)
	    {
	    	this.empid=e1.empid;
	    	this.ename=e1.ename;
	    	this.salary=e1.salary;
	    }
	    
	    public static void main(String[] args)
	    {
			Employee1 e1 = new Employee1(238426,"Harshitha",30000);
			e1.getDetails();
			Employee1 e2 = new Employee1(e1);
			e2.getDetails();
			//Employee1 e3 = new Employee1(238896,"Dakshu",50000);
			//e3.getDetails();
			
			System.out.println("After copy constructor");
			e2.getDetails();
			
		}
	    //e1.getDetails();
	   // system.out.println();
	   // e2.getDetails();
	    //system.out.println();
	    
}
