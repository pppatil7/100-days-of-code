package learn.corejava;

public class Outer {
	static int data=100;
	
	static class Inner {
		static void msg() {
			
			System.out.println("data is: "+data);
		}
	}

}
