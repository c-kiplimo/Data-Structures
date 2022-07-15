package com.LinkedList;

public class    Main {

    public static void main(String[] args) {
	// write your code here
        SingleLinkedList sl=new SingleLinkedList();
        sl.createSingleLinkedList(5);
        System.out.println(sl.head.value);
        sl.insertInLinkedList(6,1);
        sl.insertInLinkedList(7  ,3);
        sl.insertInLinkedList(8  ,4);
        sl.insertInLinkedList(9  ,0);
        System.out.println(sl.head.next.next.value);
        System.out.println("Traversal");

        sl.searchNode(8);
        sl.traverseSingleLinkedList();
        sl.deletionOfNode(4);
        System.out.println(".......................................");
        sl.traverseSingleLinkedList();
        sl.deleteSingleL();
        sl.traverseSingleLinkedList();

    }
}
