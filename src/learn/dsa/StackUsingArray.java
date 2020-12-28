package learn.dsa;

public class StackUsingArray {
	int top;
	static final int max=20;
	static int[] arr=new int[max];
	
	public StackUsingArray() {
		top=-1;
	}
	
	void push(int element) {
		if(top>=(max-1)) {
			System.out.println("overflow condition");
		}
		else {
			arr[++top]=element;
		}
	}
	
	void pop() {
		if(top<0) {
			System.out.println("underflow condition");
		}
		else {
			top--;
		}
	}
	
	
	

}
