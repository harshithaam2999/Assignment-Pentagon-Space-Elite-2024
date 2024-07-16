
public class ConstructorChaining 
{
   ConstructorChaining()
   {
	   this(10);
	   System.out.println("Constructor-1");
   }
   ConstructorChaining(int a)
   {
	   this(20,30);
	   System.out.println("Constructor-2");
   }
   ConstructorChaining(int a ,int b){
	   System.out.println("Constructor-3");
   }
   public static void main(String[] args) 
   {
	ConstructorChaining Chain = new ConstructorChaining();
}
}
