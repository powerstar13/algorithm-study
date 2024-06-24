package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FindTheIndexOfTheFirstOccurrenceInAStringTest {
    @Autowired
    private FindTheIndexOfTheFirstOccurrenceInAString findTheIndexOfTheFirstOccurrenceInAString;

    @Test
    void example1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        int actual = findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        int actual = findTheIndexOfTheFirstOccurrenceInAString.strStr(haystack, needle);
        assertEquals(expected, actual);
    }
}