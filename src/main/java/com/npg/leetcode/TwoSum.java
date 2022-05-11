package com.npg.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private int[] quadraticComplexity(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[] { i, j };

                }
            }

        }
        return null;

    }

    private int[] linearComplexity(int[] nums, int target) {

        Map<Integer, Integer> valIndeMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            valIndeMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {

            int compliment = target - nums[i];
            if (valIndeMap.containsKey(compliment) && valIndeMap.get(compliment) != i) {
                return new int[] { valIndeMap.get(compliment), i };
            }
        }

        return null;
    }

    private int[] improveLinearComplexity(int[] nums, int target) {
        Map<Integer, Integer> valIndeMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int compliment = target - nums[i];
            if (valIndeMap.containsKey(compliment)) {
                return new int[] { valIndeMap.get(compliment), i };
            }
            valIndeMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;

        // int[] result1 = new TwoSum().quadraticComplexity(nums, target);
        // int[] result1 = new TwoSum().linearComplexity(nums, target);
        int[] result1 = new TwoSum().improveLinearComplexity(nums, target);
        for (int i : result1) {
            System.out.println(i);
        }
    }

}
