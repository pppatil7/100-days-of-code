package learn.dsa;

public class QueueUsingArray {

	int front=0;
	int rear=0;
	static int max=20;
	static int[] queue=new int[max];
	public QueueUsingArray() {
		
	this.front=front;
	this.rear=rear;
		
	}
	
	void enqueue(int element) {
		if(max==rear) {
			System.out.println("overflow");
		}
		else {
			queue[rear]=element;
			rear++;
		}
	}
	void dequeue() {
		if(front==rear) {
			System.out.println("underflow");
		}
		else {
			for(int i=0;i<rear-1;i++) {
				queue[i]=queue[i+1];
			}
			if (rear < max) 
                queue[rear] = 0;
			rear--;
		}
	}
	
	
	
}
