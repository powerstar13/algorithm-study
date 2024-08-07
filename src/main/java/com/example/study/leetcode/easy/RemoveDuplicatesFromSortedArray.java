package com.example.study.leetcode.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 2) return length;
        int current = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[current]) {
                nums[++current] = nums[i];
            }
        }
        return current + 1;
    }
}
