package learn.dsa;

import java.util.Arrays;

public class TestQueue {

	public static void main(String[] args) {
		QueueUsingArray q=new QueueUsingArray();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(Arrays.toString(QueueUsingArray.queue));
		q.dequeue();
		System.out.println(Arrays.toString(QueueUsingArray.queue));
		q.enqueue(7);
		System.out.println(Arrays.toString(QueueUsingArray.queue));
	}

}
