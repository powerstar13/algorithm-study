package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {
    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void example1() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    void example2() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    void example3() {
        assertFalse(palindromeNumber.isPalindrome(10));
    }
}