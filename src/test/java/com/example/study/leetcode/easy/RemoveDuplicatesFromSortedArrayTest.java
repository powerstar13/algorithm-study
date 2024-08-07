package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    private final RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void example1() {
        int[] nums = {1, 1, 2};
        int result = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(5, result);
    }
}