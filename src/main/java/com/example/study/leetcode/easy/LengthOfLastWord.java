package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/length-of-last-word/description/
 */
@Component
class LengthOfLastWord {
    /**
     * 단어와 공백으로 구성된 문자열 s가 주어집니다.
     * 문자열에서 마지막 단어의 길이를 반환하세요.
     * 단어는 공백이 아닌 문자만으로 구성된 최대 부분 문자열입니다.
     */
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        // 문자열의 끝에서 시작하여 앞으로 이동하면서 공백이 아닌 문자를 만날 때까지 이동합니다.
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // 공백이 아닌 문자를 만나면, 그 위치를 기록하고 계속 앞으로 이동하면서 공백을 만날 때까지 문자를 세어갑니다.
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        // 문자의 수를 반환합니다.
        return length;
    }
}
