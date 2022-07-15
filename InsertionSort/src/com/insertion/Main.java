package com.insertion;

import java.util.Arrays;

public class Main {


    static  void insertionSort(int numArray[]){
        int n=numArray.length;

        for (int i=1;i<n;i++){
            int temp=numArray[i];
            int j=i-1;
            while ((j>-1)&&(numArray[j]>temp)){
                numArray[j+1]=numArray[j];
                j--;
            }
            numArray[j+1]=temp;
        }

    }

    public static void main(String[] args) {
        int numArray[]={23,45,78,90,1,34,53,24,78,12};
        System.out.println("Original Array  "+ Arrays.toString(numArray));
        insertionSort(numArray);
        System.out.println("Sorted Array  "+ Arrays.toString(numArray));

    }
}
