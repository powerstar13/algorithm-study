package com.example.study.hackkerrank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LinkedListCreationTest {
    @Autowired
    private LinkedListCreation linkedListCreation;

    /*
    1. 먼저, 두 개의 연결 리스트를 생성합니다. 하나는 원래의 연결 리스트를 나타내고, 다른 하나는 새로운 연결 리스트를 나타냅니다.
    2. 원래의 연결 리스트를 순회하면서 홀수 위치의 노드를 찾습니다.
    3. 홀수 위치의 노드를 찾으면, 그 노드를 원래의 연결 리스트에서 제거하고 새로운 연결 리스트에 추가합니다.
    4. 원래의 연결 리스트에 노드가 없을 때까지 이 과정을 반복합니다.
    5. 마지막으로, 새로운 연결 리스트의 헤드를 반환합니다.
     */
    @Test
    void sample1() {
        LinkedListCreation.SinglyLinkedList originalList = new LinkedListCreation.SinglyLinkedList();
        originalList.insertNode(5);
        originalList.insertNode(3);
        originalList.insertNode(5);
        originalList.insertNode(3);
        originalList.insertNode(7);
        originalList.insertNode(8);

        LinkedListCreation.SinglyLinkedListNode newHead = linkedListCreation.createLinkedList(originalList.head);

        assertEquals(3, newHead.data);
        assertEquals(3, newHead.next.data);
        assertEquals(8, newHead.next.next.data);
        assertEquals(5, newHead.next.next.next.data);
        assertEquals(7, newHead.next.next.next.next.data);
    }

    @Test
    void sample2() {
        LinkedListCreation.SinglyLinkedList originalList = new LinkedListCreation.SinglyLinkedList();
        originalList.insertNode(4);
        originalList.insertNode(5);
        originalList.insertNode(3);
        originalList.insertNode(2);
        originalList.insertNode(7);

        LinkedListCreation.SinglyLinkedListNode newHead = linkedListCreation.createLinkedList(originalList.head);

        assertEquals(5, newHead.data);
        assertEquals(2, newHead.next.data);
        assertEquals(3, newHead.next.next.data);
        assertEquals(7, newHead.next.next.next.data);
    }

    @Test
    void sample3() {
        LinkedListCreation.SinglyLinkedList originalList = new LinkedListCreation.SinglyLinkedList();
        originalList.insertNode(7);
        originalList.insertNode(1);
        originalList.insertNode(13);
        originalList.insertNode(13);
        originalList.insertNode(14);
        originalList.insertNode(13);
        originalList.insertNode(14);
        originalList.insertNode(7);

        LinkedListCreation.SinglyLinkedListNode newHead = linkedListCreation.createLinkedList(originalList.head);

        assertEquals(1, newHead.data);
        assertEquals(13, newHead.next.data);
        assertEquals(13, newHead.next.next.data);
        assertEquals(7, newHead.next.next.next.data);
        assertEquals(13, newHead.next.next.next.next.data);
        assertEquals(14, newHead.next.next.next.next.next.data);
        assertEquals(14, newHead.next.next.next.next.next.next.data);
    }
}