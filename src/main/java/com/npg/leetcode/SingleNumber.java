package com.npg.leetcode;

public class SingleNumber {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 2;
        intArray[1] = 1;
        intArray[2] = 3;
        intArray[3] = 3;
        intArray[4] = 5;
        intArray[5] = 1;
        intArray[6] = 2;

        int result = 0;

        for(int a : intArray){
            result = result ^ a;
        
        }

        System.out.println(result);



    }
    
}
