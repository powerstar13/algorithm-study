package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
@Component
class MergeSortedArray {
    /**
     * 두 개의 정수 배열 nums1과 nums2가 주어지며, 이들은 비감소 순서로 정렬되어 있습니다.
     * 또한, m과 n 두 정수가 주어지며, 각각 nums1과 nums2의 요소 수를 나타냅니다.
     * nums1과 nums2를 비감소 순서로 단일 배열로 병합합니다.
     * 최종 정렬된 배열은 함수에 의해 반환되어서는 안 되며, 대신 nums1 배열 내에 저장되어야 합니다.
     * 이를 수용하기 위해, nums1의 길이는 m + n이며, 첫 번째 m 요소는 병합되어야 하는 요소들을 나타내고, 마지막 n 요소는 0으로 설정되어 있으며 무시되어야 합니다.
     * nums2의 길이는 n입니다.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // nums1의 마지막 유효 요소 인덱스
        int j = n - 1; // nums2의 마지막 요소 인덱스
        int k = m + n - 1; // 병합된 배열의 마지막 인덱스

        // nums1과 nums2를 끝에서부터 비교하여, 더 큰 값을 nums1의 끝에 채워 넣습니다.
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // 만약 nums2에 남아 있는 요소가 있다면, 이들을 nums1의 남은 위치에 복사합니다.
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
