package learn.java.telusko;

class AB{
	public void show() {
		System.out.println("this is A");
	}
}

class BA extends AB{
	public void show() {
		System.out.println("this is B");
	}
	public void casio() {
		System.out.println("casio");
	}
}

class CA extends AB{
	public void show() {
		System.out.println("this is C");
	}
}

public class TestMethodOverriding {

	public static void main(String[] args) {
		AB b1 = new BA();
		b1.show();
		
		b1=new CA();
		b1.show();
		
	}

}
