package learn.corejava;

public class TestOperation {

	public static void main(String[] args) {
		Operation o=new Operation();
		System.out.println("before change"+o.data);
		o.change(o);
		System.out.println("after change"+o.data);

	}

}
