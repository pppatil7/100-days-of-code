package learn.java.telusko;

class A{
	public A(){
		System.out.println(" this is a");
			}
	
	public A(int i) {
		System.out.println("this is int a");
	}
}

class B extends  A{
	public B() {
		super(7);
		System.out.println("this is b");
	}
	public B(int i) {
		super(i);
		System.out.println("this is int b");
		
	}
}
public class TestSuper {

	public static void main(String[] args) {
		B b1 = new B();
		
		

	}

}
