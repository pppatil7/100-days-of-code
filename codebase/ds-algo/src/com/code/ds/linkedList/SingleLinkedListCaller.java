package com.code.ds.linkedList;

public class SingleLinkedListCaller {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertBefore(20);
        linkedList.insertBefore(10);
        linkedList.insertBefore(5);

        System.out.println(linkedList.traverseLinkedList());

        System.out.println("After insert");
        linkedList.insertAfter(30);
        linkedList.insertAfter(50);

        System.out.println(linkedList.traverseLinkedList());

        System.out.println("Last element: "+ linkedList.tail.getData());

    }

}
