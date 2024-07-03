package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/plus-one/description/
 */
@Component
class PlusOne {
    /**
     * 큰 정수가 정수 배열 digits로 주어지며, 여기서 각 digits[i]는 정수의 i번째 자릿수입니다.
     * 숫자들은 가장 중요한 자릿수부터 가장 덜 중요한 자릿수까지 왼쪽에서 오른쪽 순서로 정렬됩니다.
     * 큰 정수에는 선행 0이 포함되어 있지 않습니다.
     * 큰 정수를 하나 증가시키고 결과 배열을 반환하세요.
     */
    public int[] plusOne(int[] digits) {
        // 배열의 마지막 요소부터 시작하여 앞으로 이동합니다.
        for (int i = digits.length - 1; i >= 0; i--) {
            // 각 요소를 확인하면서, 9가 아닌 요소를 찾습니다.
            if (digits[i] < 9) {
                // 9가 아닌 요소를 찾으면 해당 요소를 1 증가시키고 배열을 반환합니다.
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        // 모든 요소가 9인 경우, 새로운 배열을 생성합니다.
        int[] newDigits = new int[digits.length + 1]; // 새 배열의 크기는 원래 배열의 크기보다 1 큽니다.
        newDigits[0] = 1; // 새 배열의 첫 번째 요소를 1로 설정하고 나머지 요소는 기본값인 0으로 둡니다.
        return newDigits;
    }
}
