package learn.data.structure;

public class Test {

	public static void main(String[] args) {
	    
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(30);
		list.insert(50);
		list.insert(70);
		list.insertAtStart(90);
		list.insert(100);
		list.insertAtStart(110);
		list.insertAtIndex(0, 13);
		list.deleteAtindex(2);
		list.deleteAtindex(0);
		list.show();
	}

}