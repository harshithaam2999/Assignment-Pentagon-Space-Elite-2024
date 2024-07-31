
public class StringSplit {

	public static void main(String[] args) 
	{
		String str = "Learning from mistakes";
		String strarr[]=str.split(" ");
		 //learning=0,from 1,mistakes=2
		for(int i=0;i<strarr.length;i++) 
		{
			System.out.println(strarr[i]+" "+i);
		}

	}

}
