package learn.java.telusko;

interface Pqr{
	
	public void show();
	static void showing() {
		System.out.println("showing...");
	}
}

class Def implements Pqr{
	
	public void show() {
	    
		System.out.println("show");
	}
}


public class TestInterfaceStatic {

	public static void main(String[] args) {
		Pqr.showing();
  Pqr p1 = new Def();
  p1.show();
	}

}
