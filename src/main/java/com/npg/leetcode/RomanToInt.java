package com.npg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {

        String s= "IX";

        Map<String,Integer> valueMap = new HashMap<>();
        valueMap.put("I",1);
        valueMap.put("V",5);
        valueMap.put("X",10);
        valueMap.put("L",50);
        valueMap.put("C",100);
        valueMap.put("D",500);
        valueMap.put("M",1000);
        
        System.out.println(valueMap);
        
        int result = 0;
        
        for(int i = 0; i< s.length(); i++){
            
            if(i+1<s.length() && 
            (valueMap.get(String.valueOf(s.charAt(i))) < valueMap.get(String.valueOf(s.charAt(i+1))))){
                result = result - valueMap.get(String.valueOf(s.charAt(i)));
            }else{
                result = result + valueMap.get(String.valueOf(s.charAt(i)));
            }
            
        }

        System.out.println(result);
    }
    
}
