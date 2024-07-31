import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Demo1
{
	String name = "Harshitha";
}
public class ObjectCreation 
{

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
	{
		//1.using new keyword
		Demo d = new Demo();{
		System.out.println(d);
		
		//2.using class.newinstance()
		Demo d1 = Demo.class.newInstance();
		System.out.println(d1);
		
		//3.using clone()
		ObjectCreation obj = new ObjectCreation();
		System.out.println(obj);
		ObjectCreation obj1 = (ObjectCreation) obj.clone();
		System.out.println(obj1);
		
		//4.newInstance() method of constructor
		Constructor<ObjectCreation> ob = ObjectCreation.class.getConstructor();
		ObjectCreation ob1 = ob.newInstance();
		System.out.println(obj);
	
		}
	}
}
	
