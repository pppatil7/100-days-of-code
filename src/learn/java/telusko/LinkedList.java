package learn.java.telusko;

public class LinkedList{
	Node head;
	
	public void printList() {
	    
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}	
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		
		list.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		
		list.head.next=second;
		second.next=third;
		third.next=fourth;
		
		list.printList();	
	}	
}