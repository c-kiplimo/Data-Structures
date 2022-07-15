package com.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack newStack=new Stack(5);
        boolean result= newStack.isEmpty();
        System.out.println(result);
        boolean res= newStack.isFull();
        System.out.println(res);
        newStack.push(67);
        newStack.push(77);
        newStack.push(87);
        newStack.push(97);
     newStack.deleteStack();
    }


}
