package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
@Component
class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        // 먼저, 배열의 길이를 확인합니다. 배열의 길이가 0 또는 1인 경우, 중복 요소가 없으므로 배열의 길이를 그대로 반환합니다.
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        // 그렇지 않은 경우, 두 개의 포인터를 사용하여 배열을 순회합니다. 첫 번째 포인터 i는 고유한 요소를 추적하고, 두 번째 포인터 j는 배열을 순회합니다.
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            // nums[j]가 nums[i]와 다른 경우, i를 증가시키고 nums[i]를 nums[j]로 업데이트합니다.
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // 모든 요소를 순회한 후, i + 1을 반환합니다. 이는 고유한 요소의 수를 나타냅니다.
        return i + 1;
    }
}
