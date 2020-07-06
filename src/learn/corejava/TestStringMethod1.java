package learn.corejava;

public class TestStringMethod1 {

	public static void main(String[] args) {
		String s="MsDhoni";
		System.out.println(s.startsWith("Ms"));
		System.out.println(s.startsWith("ms"));
		System.out.println(s.endsWith("ni"));
		System.out.println(s.endsWith("Ni"));
		System.out.println(s.endsWith("i"));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		String s1 = s.intern();
		System.out.println(s1);
		String s3 = new String("yuvraj");
		String s4=s3.intern();
		System.out.println(s4);
		int a = 20;
		String s5 = String.valueOf(a);
		System.out.println(20+10+50+s5+20+30);
		String s6="msdhoni is an indian cricketer.msdhoni is best finisher in the world.msdhoni is also a wicket keeper.";
		String s7=s6.replace("msdhoni", "MSDHONI");
		System.out.println(s6);
		System.out.println(s7);
	}

}
