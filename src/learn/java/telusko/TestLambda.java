package learn.java.telusko;

interface Student12{
	public void show();
	
}
public class TestLambda {

	public static void main(String[] args) {
		Student12 s1 = () ->{ System.out.println("show data");
		System.out.println("data showing");
		
		};
		s1.show();

	}

}
