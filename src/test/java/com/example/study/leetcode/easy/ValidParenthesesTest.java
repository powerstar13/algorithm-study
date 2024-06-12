package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ValidParenthesesTest {
    @Autowired
    private ValidParentheses validParentheses;

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
}