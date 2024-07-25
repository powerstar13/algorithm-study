package com.example.study.leetcode.easy;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            int currentLength = strs[i].length();
            if (currentLength < minLength) {
                minLength = currentLength;
            }
        }
        int strsLength = strs.length;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char currentPrefix = strs[0].charAt(i);
            boolean isSame = true;
            for (int j = 1; j < strsLength; j++) {
                char nextPrefix = strs[j].charAt(i);
                if (currentPrefix != nextPrefix) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                prefix.append(currentPrefix);
            } else {
                break;
            }
        }
        return prefix.toString();
    }
}
