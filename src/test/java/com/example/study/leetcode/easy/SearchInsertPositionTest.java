package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SearchInsertPositionTest {
    @Autowired
    private SearchInsertPosition searchInsertPosition;

    @Test
    void example1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int expected = 2;
        int actual = searchInsertPosition.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int expected = 1;
        int actual = searchInsertPosition.searchInsert(nums, target);
        assertEquals(expected, actual);
    }

    @Test
    void example3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int expected = 4;
        int actual = searchInsertPosition.searchInsert(nums, target);
        assertEquals(expected, actual);
    }
}