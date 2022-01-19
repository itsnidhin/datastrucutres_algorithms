package com.npg;
public class BubbleSort {

    public static void swap(int[] intArray, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;

    }

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int unSortedIndex = intArray.length - 1; unSortedIndex > 0; unSortedIndex--) {
            for (int i = 0; i < unSortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int i=0;i<intArray.length;i++)
            System.out.println(intArray[i]);

    }

}
