package pentagon.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) 
	{
		Stack<Integer> st = new Stack<>();  //stack follows FIFO first in last out
		
		st.push(12);
		st.push(45);
		st.push(55);
		st.push(60);
		st.push(11);
		System.out.println(st);
		System.out.println();
		System.out.println("poping elements");
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		
	}

}
