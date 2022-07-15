package com.stack;

public class Main {

    public static void main(String[] args) {
     /*   inStack Instack =new inStack();
        if(!Instack.isFull()){
            Instack.push(2);
            Instack.push(4);
            Instack.push(6);
            Instack.push(9);

        }
        System.out.println(Instack.pop());
        System.out.println(Instack.pop());*/
        Person person1=new Person("Collins  ","34");
        Person person2=new Person("Elsie  ","33");
        PersonStack stack =new PersonStack();
        stack.push(person1);
        stack.push(person2);
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
    }
}
