package learn.java.telusko;

class Calcu{
	public int add(int ...n) {
		int sum=0;
		for(int i:n) {
			sum=sum+i;
		}
		return sum;
	}
}
public class TestVarArgs {

	public static void main(String[] args) {
		Calcu c1 = new Calcu();
		System.out.println(c1.add(67,2,1,0));
     }
}
