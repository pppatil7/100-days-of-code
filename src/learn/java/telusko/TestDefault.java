package learn.java.telusko;

interface Abc{
	public void show();
	default void showing() {
		System.out.println("showing...ABC");
	}
}
interface Bca{
	default void showing() {
		System.out.println("showing...BCA");
	}
}
class Cba implements Abc,Bca{
	public void show() {
		System.out.println("show");
	}

	@Override
	public void showing() {
		// TODO Auto-generated method stub
		Bca.super.showing();
	}
	
}

public class TestDefault {

	public static void main(String[] args) {
     Abc c1 = new Cba();
     c1.show();
     c1.showing();

	}

}
