package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {
    private final RomanToInteger romanToInteger = new RomanToInteger();

    @Test
    void example1() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void example2() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    void example3() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}