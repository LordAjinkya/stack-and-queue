package com;

public class Stack {
    private final MyLinkedList myLinkedList;

    public Stack(){
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
        myLinkedList.add(myNode);
    }

    public void printStack(){
        myLinkedList.printMyNode();
    }

    //it is used to peak  the element from the stack.
    public INode peak(){
        return myLinkedList.head;
    }
    

}
