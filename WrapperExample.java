
public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 40;
		Integer b = 60;
		
		int num1=100;
		//Autoboxing ---> Primitive data types
		Integer num2 = num1;
		
		Integer num3 = Integer.valueOf(num1);
		//unboxing ----> wrapper to primitive
		
		Integer num4 = 1000;
		
		//implict way
		int num5 = num4;
		
		//explicitly converting from wrapper to primitive
		int num6 = num4.intValue();
		
		
		

	}

}
