package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class RemoveDuplicatesFromSortedListTest {
    @Autowired
    private RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList;

    @Test
    void example1() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    void example2() {
        RemoveDuplicatesFromSortedList.ListNode head = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next = new RemoveDuplicatesFromSortedList.ListNode(1);
        head.next.next = new RemoveDuplicatesFromSortedList.ListNode(2);
        head.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);
        head.next.next.next.next = new RemoveDuplicatesFromSortedList.ListNode(3);

        RemoveDuplicatesFromSortedList.ListNode result = removeDuplicatesFromSortedList.deleteDuplicates(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertNull(result.next.next.next);
    }
}