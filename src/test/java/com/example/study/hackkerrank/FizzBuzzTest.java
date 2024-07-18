package com.example.study.hackkerrank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FizzBuzzTest {
    @Autowired
    private FizzBuzz fizzBuzz;

    @Test
    void fizzBuzzSample() {
        assertEquals(1, fizzBuzz.fizzBuzz(1));
        assertEquals(2, fizzBuzz.fizzBuzz(2));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals(4, fizzBuzz.fizzBuzz(4));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
        assertEquals(7, fizzBuzz.fizzBuzz(7));
        assertEquals(8, fizzBuzz.fizzBuzz(8));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
        assertEquals(11, fizzBuzz.fizzBuzz(11));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(12));
        assertEquals(13, fizzBuzz.fizzBuzz(13));
        assertEquals(14, fizzBuzz.fizzBuzz(14));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }
}