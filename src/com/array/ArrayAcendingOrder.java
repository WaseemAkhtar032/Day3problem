package com.array;

import java.util.Scanner;

public class ArrayAcendingOrder {
    public static void main(String[] args) {
        System.out.println("enter the number of elements you want to enter\n");
        Scanner n = new Scanner(System.in);
        int ar = n.nextInt();
        int arr[] = new int[ar];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.nextInt();

        }
        int temp=0;
        for (int i=0; i<arr.length; i++ ){
            for (int j=i+1; j< arr.length; j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
               // System.out.println(arr[temp]);
            }
        }
        for (int i=0; i<arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
}
