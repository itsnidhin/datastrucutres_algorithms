package com.npg.leetcode;

public class IntArrrayPlusOne {

    private int[] arrayplusOne(int[] digits){

        int len = digits.length;
        
        for(int i=len-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
            
        }
        
        digits = new int[len+1];
        digits[0] = 1;
        return digits;

    }

    public static void main(String[] args) {

        int[] digits = new int[]{9,9,9};

        digits = new IntArrrayPlusOne().arrayplusOne(digits);

        for(int n:digits){
            System.out.println(n);
        }
        
    }
    
}
