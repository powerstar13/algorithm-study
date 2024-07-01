package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/description/
 */
@Component
class ValidParentheses {
    /**
     * 스택을 사용하여 괄호의 유효성을 검사합니다.
     * 	1.	문자열 s의 각 문자를 순회합니다.
     * 	2.	열린 괄호인 경우 스택에 푸시합니다.
     * 	3.	닫는 괄호인 경우 스택에서 최상위 문자를 팝하고, 해당 문자가 짝이 맞는지 확인합니다.
     * 	4.	모든 문자를 처리한 후, 스택이 비어 있으면 문자열이 유효한 것입니다.
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
