package learn.java.telusko;

class College{
	final String name="sae" ;
 final  public void show() {
	   System.out.println(name);
   }
	
}

class Student11 extends College{
		
}

public class TestFinal {

	public static void main(String[] args) {
	College c1 =new College();
	System.out.println(c1.name);
	c1.show();
	}

}
