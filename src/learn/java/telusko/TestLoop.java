package learn.java.telusko;

public class TestLoop {

	public static void main(String[] args) {
		
	for(int i=1;i<=7;i++) {
		
		if(i==4) {
			continue;
		}
		System.out.println("value is:"+i);
	}
	
	for(int j=1;j<=5;j++) {
		if(j==3) {
			break;
		}
		System.out.println("value is:"+j);
	}

	}

}
