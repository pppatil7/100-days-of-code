package learn.data.structure;

public class CLinkedList {
	
	CNode head;
	CNode tail;
	
	
	public void insert(int data) {
	    CNode node = new CNode();
        node.data=data;
	    if (head == null) {
	        head = node;
	    } else {
	        tail.next = node;
	    }

	    tail = node;
	    tail.next = head;
	}
	
	public void printList() {
		CNode node = head;
		if(head!=null) {
			do{
				System.out.println(node.data);
				node=node.next;
			}
			while(node!=head);
		}
	}	
}
