package learn.data.structure;

public class DoubleLinkedList {

	DoubleNode head;
	DoubleNode tail;
	
	public void insert(int data) {
	
		 DoubleNode newNode = new DoubleNode();  
		   newNode.data=data;
	        //if list is empty, head and tail points to newNode  
	        if(head == null) {  
	            head = tail = newNode;  
	            //head's previous will be null  
	            head.prev = null;  
	            //tail's next will be null  
	            tail.next = null;  
	        }  
	        else {  
	            //add newNode to the end of list. tail->next set to newNode  
	            tail.next = newNode;  
	            //newNode->previous set to tail  
	            newNode.prev = tail;  
	            //newNode becomes new tail  
	            tail = newNode;  
	            //tail's next point to null  
	            tail.next = null;  
	        }  
	}
	
	public void printList() {
		DoubleNode node = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(node != null) {  
            //Print each node and then go to next.  
            System.out.print(node.data + " ");  
            node = node.next;  
        }  
    }  
		
	
}