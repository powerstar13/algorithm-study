package com.example.study.leetcode.easy;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
class PalindromeNumber {
    public boolean isPalindrome(int x) {
//        String xStr = x + "";
//        for (int i = 0; i < xStr.length() / 2; i++) {
//            if (xStr.charAt(i) != xStr.charAt(xStr.length() - 1 - i)) {
//                return false;
//            }
//        }
//        return true;

        if (x < 0) return false;
//        int reversed = 0;
//        int tmp = x;
//        while (tmp != 0) {
//            int digit = tmp % 10;
//            reversed = (reversed * 10) + digit;
//            tmp /= 10;
//        }
//        return x == reversed;

        int r = 0;
        int t = x;
        while (t != 0) {
            int d = t % 10;
            r = (r * 10) + d;
            t /= 10;
        }
        return x == r;
    }
}
