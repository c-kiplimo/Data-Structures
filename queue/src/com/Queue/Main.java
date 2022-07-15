package com.Queue;

public class Main {

    public static void main(String[] args) {
	QueueArray newQueue=new QueueArray(5 );
    boolean result=newQueue.isFull();
        System.out.println(result);
        boolean result1=newQueue.isEmpty();
        System.out.println(result1);
        newQueue.enQueue(34);
        newQueue.enQueue(44);
        newQueue.enQueue(54);
        newQueue.enQueue(64);
        newQueue.enQueue(74);
        newQueue.enQueue(84);
    }
}
