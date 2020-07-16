package learn.java.telusko;

class Outer{
	int a;
	public void display() {
		System.out.println("outer");
	}
	public static void print() {
		System.out.println("static outer");
	}
	
	class Inner {
		public void show() {
		System.out.println("Inner");
	}
	
	
}
	static class Inner1{
		public void output() {
			System.out.println("static inner");
		}
	}

}
public class TestInner {

	public static void main(String[] args) {
		Outer o1=new Outer();
		o1.display();
		Outer.print();
		
		Outer.Inner i1=o1.new Inner();
        i1.show();
        
        Outer.Inner1 oi1=new Outer.Inner1();
        oi1.output();
	}

}
