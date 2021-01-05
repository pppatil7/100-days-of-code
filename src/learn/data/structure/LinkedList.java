package learn.data.structure;

public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
	    node.data=data;
	    //node.next=node;
        if(head==null) {
        	head=node;
        }
        else {
        	Node n=head;
        	while(n.next!=null) {
        		n=n.next;
        	}
        	n.next=node;
        }   
	}
	public void show() {
		Node n=head;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		//n=n.next;
		System.out.println(n.data);
	}
	
	public void insertAtStart(int data) {
		Node node=new Node();
		node.data=data;
                        	    	
			if(head==null) {
				head=node;
			}
			else {
				Node n=head;
			    head=node;
                			    
			}
	}
}