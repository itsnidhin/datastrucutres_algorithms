package com.npg.leetcode;

public class FindIndexofZero {
    

    public static void main(String[] args) {
        
        int[] nums = new int[] {-5, -2, 0, 1, 1, 2, 4};

        int a = 0;
        int b = nums.length - 1;

        int result = 0;

        while(true){

            int h = (a+b)/2;
            if(nums[h] == 0){

                result = h;
                break;

            }else if(nums[h] > 0){
                b=h;
            }else{
                a=h;
            }
        }

        System.out.println(result);

    }
}
