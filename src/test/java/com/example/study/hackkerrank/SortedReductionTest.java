package com.example.study.hackkerrank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SortedReductionTest {
    @Autowired
    private SortedReduction sortedReduction;

    @Test
    void sample0() {
        List<Integer> arr = List.of(2, 4, 1, 3, 5);
        int output = 1;
        assertEquals(output, sortedReduction.getMinIterations(arr));
    }

    @Test
    void sample1() {
        List<Integer> arr = List.of(1, 3, 3, 4);
        int output = 0;
        assertEquals(output, sortedReduction.getMinIterations(arr));
    }

    @Test
    void sample2() {
        List<Integer> arr = List.of(6, 5, 4, 3, 1, 2);
        int output = 2;
        assertEquals(output, sortedReduction.getMinIterations(arr));
    }
}