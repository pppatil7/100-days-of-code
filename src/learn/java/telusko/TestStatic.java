package learn.java.telusko;
class Emp{
	static int id;
	static int salary;
	static String hr="ppp";
	
	static void show() {
		System.out.println(id+" "+salary+" "+hr);
	}
}
public class TestStatic {

	public static void main(String[] args) {
		
		
		Emp.show();
		

	}

}
