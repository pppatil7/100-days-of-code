package com.code.ds.linkedList;

public class DllNode {
    private int data;
    private DllNode nextRef;
    private DllNode prevRef;

    public DllNode(int data){
        this.data = data;
        this.nextRef = null;
        this.prevRef = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DllNode getNextRef() {
        return nextRef;
    }

    public void setNextRef(DllNode nextRef) {
        this.nextRef = nextRef;
    }

    public DllNode getPrevRef() {
        return prevRef;
    }

    public void setPrevRef(DllNode prevRef) {
        this.prevRef = prevRef;
    }

    @Override
    public String toString() {
        return "DllNode{" +
                "data=" + data +
                '}';
    }
}
