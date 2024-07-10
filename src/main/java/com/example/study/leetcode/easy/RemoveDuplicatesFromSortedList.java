package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
@Component
class RemoveDuplicatesFromSortedList {
    /**
     * 정렬된 연결 리스트의 헤드가 주어졌을 때, 모든 중복을 삭제하여 각 요소가 한 번만 나타나도록 합니다.
     * 정렬된 연결 리스트를 반환합니다.
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            // 현재 노드와 다음 노드의 값이 같은 경우, 중복을 제거합니다.
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                // 값이 다르면, 현재 노드를 다음 노드로 이동합니다.
                current = current.next;
            }
        }
        return head;
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
