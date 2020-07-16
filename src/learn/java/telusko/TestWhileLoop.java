package learn.java.telusko;

public class TestWhileLoop {

	public static void main(String[] args) {
		int i=3;
		while(i<=7) {
			System.out.println("WhileLoop");
			i++;
		}
		
		for(i=2;i<=5;i++) {
			System.out.println("ForLoop");
		}
		
		int j=4;
		do{
			System.out.println("DoWhileLoop");
			j++;
		}while(j<=6);

	}

}
