
public class ZigZagMergeArray {

	public static void main(String[] args)
	{
		int[]a = {1,2,3,4,5,6,7,8};
		int[]b = {11,22,33,44,55,66,77,88};
		int[]c = new int[a.length+b.length];
		int i=0,j=0,k=0;
		
		//value of i and j must be equal --> both the arrays will be iterated for common length of elements
		
		while(i<a.length && j<b.length) {
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<a.length)
		{
			c[k++]=b[i++];
		}
		for(int e:c) {
			System.out.print(e+"  ");
		}

	}

}