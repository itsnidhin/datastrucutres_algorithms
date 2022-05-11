package com.npg.leetcode;

public class FindIndexofNumber {
    

    public static void main(String[] args) {

        //find index of 2
        //expectef answer -> 5
        int numToFind = 5;
        
        int[] nums = new int[] {-5, -2, 0, 1, 2, 4, 5};

        int a = 0;
        int b = nums.length - 1;

        int result = 0;

        while(true){

            int h = (a+b)/2;
            if(nums[h] == numToFind){

                result = h;
                break;

            }else if(nums[h] > numToFind){
                b=h;
            }else if(nums[h] < numToFind){
                a=h;
            }
        }

        System.out.println(result);

    }
}
