package learn.java.telusko;

public class TestWrapper {

	public static void main(String[] args) {
		int i=5;
		Integer ii=new Integer(i);
		
		int j=ii.intValue();
		System.out.println(j);
		
		Integer val=i;
		int k=val;
		System.out.println(val);
		
		String str="768";
		int n=Integer.parseInt(str);
		System.out.println(n);

	}

}
