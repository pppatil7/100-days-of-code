package learn.corejava;

public class TestEqualString {

	public static void main(String[] args) {
		String s2="patil";
		String s3="patil";
		String s1=new String("patil");
		String s4="PaTiL";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2==s4);

	}

}
