package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RemoveElementTest {
    @Autowired
    private RemoveElement removeElement;

    @Test
    void example1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int expected = 2;
        int result = removeElement.removeElement(nums, val);
        assertEquals(expected, result);
    }

    @Test
    void example2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int expected = 5;
        int result = removeElement.removeElement(nums, val);
        assertEquals(expected, result);
    }
}