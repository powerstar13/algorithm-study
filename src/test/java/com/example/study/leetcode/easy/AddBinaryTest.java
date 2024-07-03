package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AddBinaryTest {
    @Autowired
    private AddBinary addBinary;

    @Test
    void example1() {
        String a = "11";
        String b = "1";
        String expected = "100";
        String actual = addBinary.addBinary(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        String actual = addBinary.addBinary(a, b);
        assertEquals(expected, actual);
    }
}