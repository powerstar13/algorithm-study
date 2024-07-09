package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClimbingStairsTest {
    @Autowired
    private ClimbingStairs climbingStairs;

    @Test
    void example1() {
        int n = 2;
        int expected = 2;
        int actual = climbingStairs.climbStairs(n);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        int n = 3;
        int expected = 3;
        int actual = climbingStairs.climbStairs(n);
        assertEquals(expected, actual);
    }
}