package learn.dsa;

public class LinkedList {
	
	Node head;
	
	public void insert(int data) {	
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			node = head;
		} 
		else {
              Node n=head;
              while(n.next!=null) {
            	  n=n.next;
              }
		   n.next=node;
		}
	}
}