package learn.java.telusko;

interface Emp1{
	public void showdata();
}

public class TestInterface {

	public static void main(String[] args) {
		Emp1 e1 = new Emp1() {
				public void showdata() {
			System.out.println("emp id");
		}};
       e1.showdata();
	}

}
