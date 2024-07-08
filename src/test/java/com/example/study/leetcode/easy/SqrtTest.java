package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SqrtTest {
    @Autowired
    private Sqrt sqrt;

    @Test
    void example1() {
        int x = 4;
        int expected = 2;
        int actual = sqrt.mySqrt(x);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        int x = 8;
        int expected = 2;
        int actual = sqrt.mySqrt(x);
        assertEquals(expected, actual);
    }
}