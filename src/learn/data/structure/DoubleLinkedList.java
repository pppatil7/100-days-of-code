package learn.data.structure;

public class DoubleLinkedList {

	DoubleNode head;
	
	public void insert(int data) {
	
		DoubleNode node=new DoubleNode();
		node.data=data;
		
		if(head==null) {
			head=node;
		}
		else {
			
			DoubleNode n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}    	
	}
	
	public void printList() {
		DoubleNode node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
		
		
	}
}