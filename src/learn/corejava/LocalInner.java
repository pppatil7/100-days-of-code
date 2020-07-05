package learn.corejava;

public class LocalInner {
	private int data = 50;
	void display() {
		class Local{
			int value=200;
			void msgs() {
				System.out.println("value is:"+value);
			}
			
		}
		Local l=new Local();
		l.msgs();
	}

}
