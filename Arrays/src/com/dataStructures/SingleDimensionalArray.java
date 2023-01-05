package com.dataStructures;
import java.util.Arrays;

public class SingleDimensionalArray {
//initialize array
    int arr[] = null;

    public SingleDimensionalArray(int sizeofArray) {
        //instatiantiate the array
        arr = new int[sizeofArray];
        //initialize with the minimum integer detail
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted) {
        if (arr[location] == Integer.MIN_VALUE) {
            arr[location] = valueToBeInserted;
            System.out.println("Successfully Inserted");
        } else {
            System.out.println("This cell is already occupied");
        }
    }
}