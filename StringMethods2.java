
public class StringMethods2
{
  public static void main(String[] args) 
  {
	String str1 = "Harshitha";
	String str2 = "Arpitha";
	
	String str3 = new String("Dakshu");
	
	System.out.println(str1==str2);
	
	System.out.println(str2==str3);
	
	System.out.println(str1.equals(str3));
	
	System.out.println(str1.equalsIgnoreCase(str3));
	
	System.out.println(str1.contains("Harshi"));
	
	System.out.println(str1.compareTo(str3));
	
	System.out.println(str1.trim());
	
	System.out.println("Substring=========");
	
	System.out.println(str1.substring(1,2));
	
	String newstr = String.join( " ","welcome","to","pentagonspace");
	
	System.out.println(newstr);
	
	String upper="YASHU";
	System.out.println(upper.toLowerCase());
	String lower = "dakshu";
	
	System.out.println(lower.toUpperCase());
  }
}
