package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class PlusOneTest {
    @Autowired
    private PlusOne plusOne;

    @Test
    void example1() {
        int[] digits = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    void example2() {
        int[] digits = {4, 3, 2, 1};
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    void example3() {
        int[] digits = {9};
        int[] expected = {1, 0};
        assertArrayEquals(expected, plusOne.plusOne(digits));
    }
}