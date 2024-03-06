package com.example.study.leetcode.math;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 */
@Component
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String numStr = Integer.toString(x);
        StringBuilder reversedStr = new StringBuilder(numStr).reverse();
        List<String> leftToRight = new LinkedList<>();
        List<String> rightToLeft = new LinkedList<>();
        for (int i = 0; i < numStr.length(); i++) {
            char leftToRightDigit = numStr.charAt(i);
            leftToRight.add(Character.toString(leftToRightDigit));
            char rightToLeftDigit = reversedStr.charAt(i);
            rightToLeft.add(Character.toString(rightToLeftDigit));
        }
        return leftToRight.equals(rightToLeft);
    }
}
