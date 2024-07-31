package pentagon.exception;

public class FinallyIOException {

	public static void main(String[] args) {
		
		try {
			int a=40/0;
		}
		finally 
		{
			System.out.println("Important statements is getting exceuted");
		}

	}

}
