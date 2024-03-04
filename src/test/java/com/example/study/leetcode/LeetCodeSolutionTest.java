package com.example.study.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LeetCodeSolutionTest {
    @Autowired
    private LeetCodeSolution leetCodeSolution;

    @Test
    void twoSum_1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assertions.assertArrayEquals(new int[] {0, 1}, leetCodeSolution.twoSum(nums, target));
    }

    @Test
    void twoSum_2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        Assertions.assertArrayEquals(new int[] {1, 2}, leetCodeSolution.twoSum(nums, target));
    }

    @Test
    void twoSum_3() {
        int[] nums = {3, 3};
        int target = 6;
        Assertions.assertArrayEquals(new int[] {0, 1}, leetCodeSolution.twoSum(nums, target));
    }
}