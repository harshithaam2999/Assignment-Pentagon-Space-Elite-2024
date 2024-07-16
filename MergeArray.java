
public class MergeArray {

	public static void main(String[] args) 
	{
		int[] arr1= {1,5,3,5,6,8,12,6,9};
		int[] arr2= {1,5,7,2,7,2,61,8,9};
		/*
		 * Direct merging
		 */
		int[] result = new int[arr1.length+arr2.length];
		for(int i=0;i<result.length;i++)
		{
			if(i<arr1.length) {
				result[i]=arr1[i];
				
			}
			else {
				result[i]=arr2[i-arr1.length];
			}
		
		}
		for(int ele:result) {
			System.out.print(ele+" , ");
		}

	}

}
