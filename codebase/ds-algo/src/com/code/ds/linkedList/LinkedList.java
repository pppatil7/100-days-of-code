package com.code.ds.linkedList;

public class LinkedList {
    Node head;
    Node tail;

    private int size = 0;

    // constructor
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    // Push
    public void insertBefore(int value){
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        if (tail == null){
            tail = node;
        }
    }

    // Append
    public void insertAfter(int value){
        Node newNode = new Node(value);
        newNode.setNext(null);
        tail.setNext(newNode);
        tail = newNode;
    }

    // Delete
    public void delteNodeByKey(int value){
        Node temp = head, prev = null;

        // found first node
        if(temp != null && temp.getData() == value){
            head = temp.getNext();
            return;
        }

        while (temp != null && temp.getData() != value){
            prev = temp;
            temp = temp.getNext();
        }

        if (temp == null) return;

        prev.setNext(temp.getNext());

    }


    public String traverseLinkedList(){

        Node n = head;
        String result = "[ ";
        while (n != null){
            //System.out.print(n.getData()+ " ");
            result += n.getData()+ ", ";
            n = n.getNext();
        }
        result +=" ]";
        return result;
    }



}
