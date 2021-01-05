package learn.data.structure;

public class CLinkedList {
	
	CNode head;
	
	
	public void insert(int data) {
		CNode node=new CNode();
		node.data=data;
		
		if(head==null) {
			head=node;
		}
		else {
			CNode n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	
	public void printList() {
		CNode node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
}
