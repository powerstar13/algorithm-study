package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 */
@Component
public class FindTheIndexOfTheFirstOccurrenceInAString {
    /**
     * 두 개의 문자열 needle과 haystack이 주어집니다.
     * haystack에서 needle의 첫 번째 발생 인덱스를 반환하세요.
     * 만약 needle이 haystack의 일부가 아니라면 -1을 반환하세요.
     * 예시 1:
     *      입력: haystack = "sadbutsad", needle = "sad" 출력: 0
     *      설명: "sad"는 인덱스 0과 6에서 발생합니다. 첫 번째 발생은 인덱스 0에서 이므로 0을 반환합니다.
     * 예시 2:
     *      입력: haystack = "leetcode", needle = "leeto" 출력: -1
     *      설명: "leeto"는 "leetcode"에 나타나지 않으므로 -1을 반환합니다.
     * 제약 조건:
     *      1 <= haystack.length, needle.length <= 104
     *      haystack과 needle은 소문자 영어 문자로만 구성됩니다.
     */
    public int strStr(String haystack, String needle) {
        // 먼저, needle이 빈 문자열인지 확인합니다. needle이 빈 문자열인 경우, 항상 0을 반환합니다.
        if (needle.isEmpty()) {
            return 0;
        }
        // 그렇지 않은 경우, haystack의 각 인덱스에 대해 needle이 haystack의 해당 부분 문자열과 일치하는지 확인합니다.
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            // 일치하는 부분 문자열을 찾으면 해당 인덱스를 반환합니다.
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        // haystack의 모든 인덱스를 확인한 후에도 일치하는 부분 문자열을 찾지 못하면 -1을 반환합니다.
        return -1;
    }
}
