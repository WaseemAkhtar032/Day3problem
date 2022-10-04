package com.array;

import java.util.Scanner;

public class Array2ndLarge {
    public static void main(String[] args) {
        System.out.println("enter the number of elements you want to enter\n");
        Scanner n = new Scanner(System.in);
        int ar = n.nextInt();
        int arr[] = new int[ar];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = n.nextInt();

        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){

                max =arr[i];
            }

        }
        int secondMax = arr[0];
        for (int i=0; i<arr.length; i++ ){
            if ( arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        System.out.println("LARGEST NUMBER OF GIVEN ARRAY IS ::"+max);
        System.out.println("SECOND LARGEST NUMBER OF GIVEN ARRAY IS ::"+secondMax);
    }
}
