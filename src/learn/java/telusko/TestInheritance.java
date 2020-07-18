package learn.java.telusko;

class Calculator7{
	public int add(int i,int j) {
		return i+j;
	}
}



class AdvCalculator7 extends Calculator7{
	public int sub(int i,int j) {
		return i-j;
	}
}



class VeryAdvCalculator7 extends AdvCalculator7{
	public int mul(int i,int j) {
		return i*j;
	}
}



public class TestInheritance {

	public static void main(String[] args) {
		 VeryAdvCalculator7 c1 = new VeryAdvCalculator7();
         System.out.println(c1.add(3, 4));
         System.out.println(c1.sub(5, 2));
         System.out.println(c1.mul(7, 7));
	}

}
