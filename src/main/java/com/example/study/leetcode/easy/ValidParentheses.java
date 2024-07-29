package com.example.study.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[', ']');
        boolean result = false;
        for (int i = 0; i < s.length(); i += 2) {
            char closedBracket = parentheses.get(s.charAt(i));
            if (s.charAt(i + 1) == closedBracket) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
