package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/sqrtx/description/
 */
@Component
class Sqrt {
    /**
     * 주어진 비음수 정수 x에 대해, 가장 가까운 정수로 내림한 x의 제곱근을 반환합니다.
     * 반환되는 정수는 비음수여야 합니다.
     * 어떠한 내장 지수 함수나 연산자도 사용해서는 안 됩니다.
     * 예를 들어, C++의 pow(x, 0.5)나 Python의 x ** 0.5 같은 것을 사용하지 마세요.
     */
    public int mySqrt(int x) {
        if (x < 2) return x; // x가 2보다 작으면, x의 제곱근은 x 자신입니다.

        long start = 1, end = x / 2; // 이진 탐색을 위한 시작점과 끝점을 설정합니다.
        while (start <= end) { // 시작점이 끝점보다 작거나 같을 때까지 반복합니다.
            long mid = start + (end - start) / 2; // 중간점을 찾습니다.
            long square = mid * mid; // 중간점의 제곱을 계산합니다.
            if (square == x) return (int) mid; // 중간점의 제곱이 x와 같다면, 그 값이 제곱근입니다.
            if (square < x) start = mid + 1; // 중간점의 제곱이 x보다 작다면, 시작점을 중간점의 오른쪽으로 옮깁니다.
            else end = mid - 1; // 중간점의 제곱이 x보다 크다면, 끝점을 중간점의 왼쪽으로 옮깁니다.
        }
        return (int) end; // 루프가 종료되면, end는 x의 제곱근의 내림값입니다.
    }
}
