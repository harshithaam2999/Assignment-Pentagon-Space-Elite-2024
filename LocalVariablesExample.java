
public class LocalVariablesExample 
{
   public void calculatesum() {
	   //local variables declared within a method
	   int a=10;
	   int b=20;
	   int sum=a+b;
	   
	   System.out.println("Sum of " + a + " and " + b + " is: " + sum);
   }
   
   public void calculateproduct() {
	   
	   int num1=25;
	   int num2=2;
	   int product=num1*num2;
	   
	   System.out.println("Product of " + num1 +" and " + num2 +" is: " + product);
   }


public static void main(String[] args) 
{
	LocalVariablesExample example= new LocalVariablesExample();
	example.calculatesum();
	example.calculateproduct();
	
	
}
}