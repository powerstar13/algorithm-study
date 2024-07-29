package com.example.study.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        Map<Character, Character> parentheses = new HashMap<>();
        parentheses.put('(', ')');
        parentheses.put('{', '}');
        parentheses.put('[', ']');
        Stack<Character> opens = new Stack<>();
        for (char current : s.toCharArray()) {
            if (parentheses.containsKey(current)) opens.push(current);
            else if (opens.isEmpty() || parentheses.get(opens.pop()) != current) return false;
        }
        return opens.isEmpty();
    }
}
