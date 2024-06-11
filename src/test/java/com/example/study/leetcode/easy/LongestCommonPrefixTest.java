package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LongestCommonPrefixTest {
    @Autowired
    private LongestCommonPrefix longestCommonPrefix;

    @Test
    void example1() {
        String[] strs = {"flower", "flow", "flight"};
        String output = "fl";
        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void example2() {
        String[] strs = {"dog", "racecar", "car"};
        String output = "";
        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }
}