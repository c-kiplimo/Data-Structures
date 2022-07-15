package com.Queue;

public class QueueArray {
   int[] arr;
   int topOfQueue;
   int beginningOfqueue;
   public QueueArray(int size){
      this.arr=new int[size];
      this.topOfQueue=-1;
      this.beginningOfqueue=-1;
      System.out.println("The Queue is succesfully created with size of : "+size);

   }
   public  boolean isFull(){
      if (topOfQueue== arr.length-1){
         return true;
      }
      else {
         return false;
      }
   }
   public  boolean isEmpty(){
      if (beginningOfqueue== -1 || beginningOfqueue==arr.length){
         return  true;
      }
      else {
         return false;
      }
   }
   public  void enQueue(int value){
      if (isFull()){
         System.out.println("The Queue is full");
      }
      else if (isEmpty()){
         beginningOfqueue=0;
         topOfQueue++;
         arr[topOfQueue]=value;
         System.out.println("Succsesfully inserted "+value+" in the queue");
      }
      else {
         topOfQueue++;
         arr[topOfQueue]=value;
         System.out.println("Succsesfully inserted "+value+" in the queue");
      }
      }

   }

