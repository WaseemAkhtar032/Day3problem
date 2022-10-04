package com.array;

import java.util.Scanner;

public class ArrayOddPosition {
    public static void main(String[] args) {
        System.out.println("enter the number of elements you want to enter\n");
        Scanner n = new Scanner(System.in);
        int ar = n.nextInt();
        int arr[] = new int[ar];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.nextInt();

        }
        for (int i=0; i<arr.length; i++ ){

            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
