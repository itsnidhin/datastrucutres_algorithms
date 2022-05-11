package com.npg.leetcode;

public class NumberOddorEven {

    public static void main(String[] args) {
        int number = 1;

        if ((number & 1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    
}
