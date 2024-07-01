package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
@Component
class MergeTwoSortedLists {
    /**
     * 1. 두 리스트 중 하나가 비어있는지 확인합니다. 만약 하나라도 비어있다면, 비어있지 않은 리스트를 반환합니다. 둘 다 비어있다면, null을 반환합니다.
     * 2. 두 리스트의 헤드를 비교하여 더 작은 값을 가진 노드를 선택합니다. 이 노드를 결과 리스트의 헤드로 설정합니다.
     * 3. 선택된 노드의 다음 노드와 다른 리스트의 헤드를 비교하여 더 작은 값을 가진 노드를 선택합니다. 이 노드를 결과 리스트의 다음 노드로 설정합니다.
     * 4. 이 과정을 두 리스트 중 하나가 끝날 때까지 반복합니다.
     * 5. 한 리스트가 끝났다면, 남아있는 리스트의 나머지 노드를 결과 리스트의 끝에 연결합니다.
     * 6. 결과 리스트의 헤드를 반환합니다.
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

