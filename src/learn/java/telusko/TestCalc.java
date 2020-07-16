package learn.java.telusko;



public class TestCalc {

	public static void main(String[] args) {
		Calc c2=new Calc();
		System.out.println(c2.a);
		
		Calc c1=new Calc(6);
	

	}

}
class Calc{
	int a=7;
	int b;
	int result;
	public Calc() {
		a=7;
		System.out.println(a);
	}
	
	public Calc(int k) {
		this.a=k;
		System.out.println(k);
		
	}
}