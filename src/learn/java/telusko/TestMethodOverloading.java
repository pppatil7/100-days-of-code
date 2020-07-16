package learn.java.telusko;

class Hp{
	int num1=1;
	int num2=2;
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a) {
		this.num1=a;
		System.out.println(a);
	}
	
}


public class TestMethodOverloading {

	public static void main(String[] args) {
     Hp h1=new Hp();
     h1.add(4);
     h1.add(1, 4);
	}

}
