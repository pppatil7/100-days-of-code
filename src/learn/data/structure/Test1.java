package learn.data.structure;

public class Test1 {

	public static void main(String[] args) {
		CLinkedList clist=new CLinkedList();
		clist.insert(10);
		clist.insert(20);
		clist.insert(30);
		clist.insert(40);
		clist.insert(70);
		clist.printList();
		System.out.println(clist.tail.data);
        clist.insert(34);
        System.out.println(clist.tail.next.data);
	}

}
