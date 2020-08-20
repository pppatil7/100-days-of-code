package learn.java.telusko;
abstract class Human{
	abstract public void eat();
	public void walk() {
		
	}
}

 class Man extends Human{
	public void eat() {
		System.out.println("eating");
	}
	public void walk() {
		
	}
}
 class Women extends Human{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	 
 }
public class TestAbstract {

	public static void main(String[] args) {
		Human h1 = new Man();
		h1.eat();

	}

}
