class Vehicle
{
	void CarFeatures() 
	{
		System.out.println("Engine \n ,Accelerate \n ,Brake \n ,Wheels \n");
	}
}
class car extends Vehicle
{
	String EngineType="Petrol";
	void car() 
	{
		CarFeatures();
		System.out.println("Engine type" + EngineType);
	}
}
 class Maruthi800 extends car
 {
	 int modelyear = 2000;
	 double price = 200000;
	 void maruthicardetails()
	 {
		 CarFeatures();
		 System.out.println("Model Year " + modelyear);
		 System.out.println("Price "+ price);
		 System.out.println();	 
	 }
 }

	
public class MultiLevelInheritance {

	public static void main(String[] args)
	{
		car c = new car();
		c.CarFeatures();
		c.car();

	}

}
