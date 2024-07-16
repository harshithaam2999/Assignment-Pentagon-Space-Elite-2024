
public class MutableString 
{
  public static void main(String[] args)
  {
	StringBuffer buf  = new StringBuffer("Hello ");
	
	buf.append("World");
	System.out.println(buf);
	
	StringBuilder builder = new StringBuilder("Java ");
	
	builder.append("programing");
	
	System.out.println(builder);
	
	String str = new String("Bangalore");
	
	str = str.intern();
	
	String str1="Bangalore";
	System.out.println(str==str1);
	
	
}
}
