package learn.java.telusko;

public class TestException {

	public static void main(String[] args) {
		try {
			int a[]=null;
			a[2]=7;
			int i=7;
			int j=1;
			int k=i/j;
			System.out.println("output is "+k);
			System.out.println("bye");
		}
		catch(ArithmeticException e) {
			System.out.println("error ");
		}
		
		catch(Exception e) {
			System.out.println("stay in your limit.. ");
		
		}
		
		
		finally {
			System.out.println("finally..");
		}
		

	}

}
