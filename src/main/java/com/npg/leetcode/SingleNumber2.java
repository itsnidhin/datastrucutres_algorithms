package com.npg.leetcode;

public class SingleNumber2 {

    public static void main(String[] args) {
        int[] intArray = new int[4];

        intArray[0] = 2;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 2;
        

        int seenOnce = 0;
        int seenTwice = 0;
        
        for(int a : intArray){
            
            seenOnce = ~seenTwice & (seenOnce ^ a);
            seenTwice = ~seenOnce & (seenTwice ^ a);
        }
        System.out.println(seenOnce);
        System.out.println(seenTwice);



    }
    
}
