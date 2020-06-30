package learn.corejava;

public class TestStatic {

	public static void main(String[] args) {
		Static.change();
		Static s1=new Static(1,"ankit");
		Static s2=new Static(2,"john");
		s1.display();
		s2.display();
	}
}
