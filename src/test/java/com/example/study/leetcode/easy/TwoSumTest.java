package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class TwoSumTest {
    @Autowired
    private TwoSum twoSum;

    @Test
    void example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = {0, 1};
        assertArrayEquals(output, twoSum.solution(nums, target));
    }

    @Test
    void example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] output = {1, 2};
        assertArrayEquals(output, twoSum.solution(nums, target));
    }

    @Test
    void example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] output = {0, 1};
        assertArrayEquals(output, twoSum.solution(nums, target));
    }
}