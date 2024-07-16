
public class SumandProduct{

	public static void main(String[] args)
	{
		int[] array = {10,20,30,40,50};
		
		//calculating sum and product
		int sum=0;
		long product =1;
		
		//logic
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
			product*=array[i];
			
		}
		
		//to print the sum and product
		System.out.println("sum of array elements is:"+sum);
		System.out.println("product of array elents is:"+product);						

	}
}




