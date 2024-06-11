package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PalindromeNumberTest {
    @Autowired
    private PalindromeNumber palindromeNumber;

    @Test
    void example1() {
        int x = 121;
        boolean output = true;
        assertEquals(output, palindromeNumber.isPalindrome(x));
    }

    @Test
    void example2() {
        int x = -121;
        boolean output = false;
        assertEquals(output, palindromeNumber.isPalindrome(x));
    }

    @Test
    void example3() {
        int x = 10;
        boolean output = false;
        assertEquals(output, palindromeNumber.isPalindrome(x));
    }
}