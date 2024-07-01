package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */
@Component
class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = getRomanValue(s.charAt(i));
            int nextValue = i + 1 < s.length() ? getRomanValue(s.charAt(i + 1)) : 0;

            if (currentValue < nextValue) {
                result += nextValue - currentValue;
                i++;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    private int getRomanValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman character: " + c);
        };
    }
}
