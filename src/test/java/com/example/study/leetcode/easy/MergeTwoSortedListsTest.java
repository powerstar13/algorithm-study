package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class MergeTwoSortedListsTest {
    @Autowired
    private MergeTwoSortedLists mergeTwoSortedLists;

    @Test
    void example1() {
        MergeTwoSortedLists.ListNode list1 = new MergeTwoSortedLists.ListNode(1);
        list1.next = new MergeTwoSortedLists.ListNode(2);
        list1.next.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(1);
        list2.next = new MergeTwoSortedLists.ListNode(3);
        list2.next.next = new MergeTwoSortedLists.ListNode(4);

        MergeTwoSortedLists.ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(1, result.val);
        assertEquals(1, result.next.val);
        assertEquals(2, result.next.next.val);
        assertEquals(3, result.next.next.next.val);
        assertEquals(4, result.next.next.next.next.val);
        assertEquals(4, result.next.next.next.next.next.val);
    }

    @Test
    void example2() {
        MergeTwoSortedLists.ListNode list1 = null;

        MergeTwoSortedLists.ListNode list2 = null;

        MergeTwoSortedLists.ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertNull(result);
    }

    @Test
    void example3() {
        MergeTwoSortedLists.ListNode list1 = null;

        MergeTwoSortedLists.ListNode list2 = new MergeTwoSortedLists.ListNode(0);

        MergeTwoSortedLists.ListNode result = mergeTwoSortedLists.mergeTwoLists(list1, list2);

        assertEquals(0, result.val);
    }
}