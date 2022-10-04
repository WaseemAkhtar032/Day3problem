package com.array;

public class ArrayFrequencyElement {
    public static void main(String[] args) {
        int arr[] = {20, 10, 25, 20, 30, 20, 10, 15};

        for (int i = 0; i < arr.length; i++) {
            int freq = 1;
            boolean matchFound = false;
            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i] == arr[j])

                System.out.println("frequency of\t " +arr[i]);
            }
        }
    }
}
