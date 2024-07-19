package com.example.study.leetcode.easy;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        int length = nums.length;
//        for (int i = 0; i < length - 1; i++) {
//            for (int j = i + 1; j < length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[2];

        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numsMap.containsKey(diff)) {
                return new int[]{ i, numsMap.get(diff) };
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
