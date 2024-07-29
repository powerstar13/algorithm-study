package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    private final ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void example1() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    void example2() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    void example3() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    void example4() {
        assertTrue(validParentheses.isValid("{[]}"));
    }
}