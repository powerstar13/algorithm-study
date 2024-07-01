package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/search-insert-position/description/
 */
@Component
class SearchInsertPosition {
    /**
     * 주어진 정렬된 고유 정수 배열과 목표값이 있을 때, 목표값이 발견되면 인덱스를 반환합니다.
     * 그렇지 않으면, 목표값이 삽입될 경우의 인덱스를 반환합니다.
     *
     * 이 문제를 해결하는 방법은 이진 검색을 사용하는 것입니다.
     * 이진 검색은 정렬된 배열에서 특정 값을 찾는 가장 효율적인 방법입니다.
     * 이 문제에서는 목표값이 배열에 없을 수도 있으므로, 이진 검색을 약간 수정하여 목표값이 삽입될 위치를 찾아야 합니다.
     */
    public int searchInsert(int[] nums, int target) {
        // 먼저, 두 개의 포인터 left와 right를 초기화하여 배열의 시작과 끝을 가리키게 합니다.
        int left = 0;
        int right = nums.length - 1;
        // left가 right보다 작거나 같은 동안 반복문을 실행합니다.
        while (left <= right) {
            // 반복문 내에서, mid를 계산하여 left와 right의 중간 인덱스를 찾습니다.
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) { // nums[mid]가 target과 같은 경우, mid를 반환합니다.
                return mid;
            } else if (nums[mid] < target) { // nums[mid]가 target보다 작은 경우, left를 mid + 1로 업데이트합니다.
                left = mid + 1;
            } else { // nums[mid]가 target보다 큰 경우, right를 mid - 1로 업데이트합니다.
                right = mid - 1;
            }
        }
        // 반복문이 종료되면, left는 target이 삽입될 위치를 가리킵니다. 따라서 left를 반환합니다.
        return left;
    }
}
