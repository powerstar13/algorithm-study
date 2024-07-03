package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/add-binary/description/
 */
@Component
class AddBinary {
    /**
     * 두 개의 이진 문자열 a와 b가 주어졌을 때, 그들의 합을 이진 문자열로 반환하세요.
     */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0; // 두 문자열의 마지막 인덱스와 올림수 초기화
        while (i >= 0 || j >= 0) { // 두 문자열의 모든 자리를 확인할 때까지 반복
            int sum = carry; // 현재 자리의 합계를 올림수로 초기화
            if (i >= 0) sum += a.charAt(i--) - '0'; // a의 현재 자리수를 합계에 추가하고 인덱스 감소
            if (j >= 0) sum += b.charAt(j--) - '0'; // b의 현재 자리수를 합계에 추가하고 인덱스 감소
            sb.append(sum % 2); // 합계를 2로 나눈 나머지를 결과에 추가 (이진수 계산)
            carry = sum / 2; // 합계를 2로 나눈 몫을 새로운 올림수로 설정
        }
        if (carry != 0) sb.append(carry); // 마지막 올림수가 있으면 결과에 추가
        return sb.reverse().toString(); // 결과 문자열을 뒤집고 문자열로 변환하여 반환
    }
}
