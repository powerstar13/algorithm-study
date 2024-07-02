package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LengthOfLastWordTest {
    @Autowired
    private LengthOfLastWord lengthOfLastWord;

    @Test
    void example1() {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
    }

    @Test
    void example2() {
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void example3() {
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }
}