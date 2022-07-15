package com.dataStructures;
import java.util.Arrays;

public class SingleDimensionalArray {

   int arr[]=null;
   public SingleDimensionalArray(int sizeofArray){
       arr=new int[sizeofArray];
       for(int i=0;i<arr.length;i++){
           arr[i]=Integer.MIN_VALUE;
       }
   }
   public void insert(int location,int valueToBeInserted){
 tryarr[location]==Integer.MIN_VALUE){
arr[location]=valueToBeInserted;
       System.out.println("Successfully Inserted");
}else{
       System.out.println("This cell is already occupied");
}}