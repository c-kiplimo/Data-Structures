package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
    static void selectionSort(int arr[]) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int smallerNumber = arr[min];
            arr[min] = arr[i];
            arr[i] = smallerNumber;
        }
    }


    public static void main(String[] args) {
        int arr[] = {111, 4, 46, 8, 58, 34, 67, 90, 45};
        System.out.println("Original Array  " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array  " + Arrays.toString(arr));

    }
}