package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/climbing-stairs/description/
 */
@Component
class ClimbingStairs {
    /**
     * 계단을 오르고 있습니다.
     * 정상에 도달하기 위해 n개의 계단을 올라야 합니다.
     * 매번 1계단 또는 2계단을 오를 수 있습니다.
     * 정상까지 오르는 데 있어 몇 가지 고유한 방법이 있을까요?
     */
    public int climbStairs(int n) {
        // n이 1 이하인 경우, 오를 수 있는 방법은 n과 같습니다.
        if (n <= 1) return n;

        // dp 배열을 사용하여 각 단계에서의 오르는 방법의 수를 저장합니다.
        int[] dp = new int[n + 1];
        // 첫 번째 계단과 두 번째 계단을 오를 수 있는 방법의 수를 초기화합니다.
        dp[1] = 1;
        dp[2] = 2;

        // 3번째 계단부터 n번째 계단까지, 각 계단을 오를 수 있는 방법의 수를 계산합니다.
        for (int i = 3; i <= n; i++) {
            // 현재 계단을 오를 수 있는 방법의 수는 이전 두 계단을 오를 수 있는 방법의 수의 합입니다.
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        // n번째 계단을 오를 수 있는 방법의 수를 반환합니다.
        return dp[n];
    }
}
