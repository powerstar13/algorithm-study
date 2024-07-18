package com.example.study.coderpad;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HealingpaperTest {
    @Autowired
    private Healingpaper healingpaper;

    @Test
    void rotateListExample1() {
        assertIterableEquals(
                healingpaper.rotateList(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 2),
                List.of(3, 4, 5, 1, 2)
        );
    }

    @Test
    void rotateListExample2() {
        assertIterableEquals(
                healingpaper.rotateList(new ArrayList<>(List.of(1, 2, 3, 4, 5)), 8),
                List.of(4, 5, 1, 2, 3)
        );
    }

    @Test
    void rotateListExample3() {
        assertIterableEquals(
                healingpaper.rotateList(new ArrayList<>(List.of(1, 2, 3, 4, 5)), -1),
                List.of(5, 1, 2, 3, 4)
        );
    }

    @Test
    void stringToIntegerExample1() {
        assertEquals(123, healingpaper.stringToInteger("123"));
    }

    @Test
    void stringToIntegerExample2() {
        assertNull(healingpaper.stringToInteger("123.456"));
    }

    @Test
    void stringToIntegerExample3() {
        assertEquals(-123, healingpaper.stringToInteger("-123"));
    }
}