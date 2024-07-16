
public class Employee 
{
    int empid;
    String ename; //instance variable
    double salary;
    
    Employee(int empid, String ename, double salary) //local variables
    {
    	this.empid=empid;
    	this.ename=ename;
    	this.salary=salary;
    	
    }
    Employee()
    {
    	
    }
    Employee getobj() 
    {
    	return this;
    }
    
    public static void main(String[] args) 
    {
    	Employee emp = new Employee();
		System.out.println(emp.getobj());
	}
    
}
