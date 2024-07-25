package com.example.study.leetcode.easy;

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */
class RomanToInteger {

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
//            char slice = s.charAt(i);
//            char next = ' ';
//            if (i + 1 != s.length()) {
//                next = s.charAt(i + 1);
//            }
//            switch (slice) {
//                case 'I': {
//                    if (next == 'V') {
//                        number += 4;
//                        i++;
//                    } else if (next == 'X') {
//                        number += 9;
//                        i++;
//                    } else {
//                        number += 1;
//                    }
//                    break;
//                }
//                case 'V': number += 5; break;
//                case 'X': {
//                    if (next == 'L') {
//                        number += 40;
//                        i++;
//                    } else if (next == 'C') {
//                        number += 90;
//                        i++;
//                    } else {
//                        number += 10;
//                    }
//                    break;
//                }
//                case 'L': number += 50; break;
//                case 'C': {
//                    if (next == 'D') {
//                        number += 400;
//                        i++;
//                    } else if (next == 'M') {
//                        number += 900;
//                        i++;
//                    } else {
//                        number += 100;
//                    }
//                    break;
//                }
//                case 'D': number += 500; break;
//                case 'M': number += 1000; break;
//            }
            int current = getValue(s.charAt(i));
            if (i + 1 < s.length() && current < getValue(s.charAt(i + 1))) {
                number -= current;
            } else {
                number += current;
            }
        }
        return number;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
