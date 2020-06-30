package learn.corejava;

public class TestEmp {

	public static void main(String[] args) {
		Address a1=new Address("udgir","maharashtra","india");
		Address a2=new Address("latur","maharashtra","india");
		
		Emp e1=new Emp(1,"john",a1);
		Emp e2=new Emp(2,"michael",a2);
		
		e1.display();
		e2.display();

	}

}
