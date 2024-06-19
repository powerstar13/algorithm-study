package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/remove-element/description/
 */
@Component
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        // 먼저, 배열의 길이를 확인합니다. 배열의 길이가 0인 경우, 제거할 요소가 없으므로 0을 반환합니다.
        if (nums.length == 0) {
            return 0;
        }
        // 그렇지 않은 경우, 두 개의 포인터를 사용하여 배열을 순회합니다. 첫 번째 포인터 i는 val과 다른 요소를 추적하고, 두 번째 포인터 j는 배열을 순회합니다.
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            // nums[j]가 val과 다른 경우, nums[i]를 nums[j]로 업데이트하고 i를 증가시킵니다.
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        // 모든 요소를 순회한 후, i를 반환합니다. 이는 val과 다른 요소의 수를 나타냅니다.
        return i;
    }
}
