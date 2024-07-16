
public class StringUpperToLower 
{
  public static void main(String[] args)
  {
	//String str1 = "Harshitha";
	//String str2 = "Arpitha";
	
	//String upper = "HARSHITHA";
	//System.out.println(upper.toLowerCase());
    //String lower="yashu";
	//System.out.println(lower.toUpperCase());
	  
	  String str = "HELLO WORLD";
	  for(int i=0;i<str.length();i++)
	  {
		  if(str.charAt(i)>65&&str.charAt(i)<90)
		  {
			  System.out.print((char)(str.charAt(i)+32));
		  }
		  else if(str.charAt(i)>97 && str.charAt(i)<122)
				  
		  {
			  System.out.print((char)(str.charAt(i)-32));
		  }
		  else
		  {
			  System.out.print(str.charAt(i));
		  }
	  }
	  
		

	
	
	
  }
}
