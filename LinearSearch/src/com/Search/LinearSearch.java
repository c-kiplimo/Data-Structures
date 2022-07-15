package com.Search;

public class LinearSearch {
    static void Search( int data){
        int arr[]={45,67,34,78,90,34};
        int n= arr.length;


        for (int i=0;i<n;i++){
            if(arr[i]==data){
                System.out.println("Element found at "+i);
            }
           
        }


    }

    public static void main(String[] args) {

   Search(67);
    }
}
