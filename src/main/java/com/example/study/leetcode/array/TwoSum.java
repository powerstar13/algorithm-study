package com.example.study.leetcode.array;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
@Component
public class TwoSum {
    public int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
