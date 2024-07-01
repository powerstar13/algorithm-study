package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
@Component
class LongestCommonPrefix {
    /**
     * 각 문자열에 대해 공통 접두사를 찾는 동안 반복적으로 접두사를 줄여나갑니다.
     * 만약 공통 접두사가 없다면 빈 문자열을 반환합니다.
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
