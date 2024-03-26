package com.example.study.leetcode.math;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RomanToIntegerTest {
    @Autowired
    private RomanToInteger romanToInteger;

    @Test
    void example1() {
        String s = "III";
        int output = 3;
        assertEquals(output, romanToInteger.romanToInt(s));
    }

    @Test
    void example2() {
        String s = "LVIII";
        int output = 58;
        assertEquals(output, romanToInteger.romanToInt(s));
    }

    @Test
    void example3() {
        String s = "MCMXCIV";
        int output = 1994;
        assertEquals(output, romanToInteger.romanToInt(s));
    }
}