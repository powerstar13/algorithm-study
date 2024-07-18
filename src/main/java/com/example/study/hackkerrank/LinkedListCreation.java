package com.example.study.hackkerrank;

import org.springframework.stereotype.Component;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * https://www.hackerrank.com/test/4ckjkji3bql/questions/aiirq2igsri
 */
@Component
class LinkedListCreation {
    /*

    <div class="ps-content-wrapper-v0">
<p>There is a singly linked list of&nbsp;<em>n</em>&nbsp;nodes. Each node instance, a&nbsp;<em>SinglyLinkedListNode</em>, has an integer value,&nbsp;<em>data</em>, and a pointer to the next node,&nbsp;<em>next</em>. Perform the following operations to generate a new linked list.</p>

<ol>
	<li>Select all the nodes at odd positions.</li>
	<li>Append these nodes to the new linked list keeping them in their original order.</li>
	<li>Delete these nodes from the old linked list.</li>
	<li>Repeat from&nbsp;step 1 until there are no nodes left in the old linked list.</li>
</ol>

<p>&nbsp;</p>

<p>Return a reference to the head of the final linked list.</p>

<p>&nbsp;</p>

<p><strong>Note:&nbsp;</strong>Extra memory other than&nbsp;creating some&nbsp;new nodes should not be used for the implementation.</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Example</strong></p>

<p>The initial linked list is:</p>

<p style="text-align:center;"><img height="49" src="https://hrcdn.net/s3_pub/istreet-assets/CiIJKg_UeVnkfNB5JnBTAg/linkedlist.png" width="701" data-a11y="img-alt" alt="Singly linked list nodes with values 1, 5, 2, 7, 8, 3 in sequence."></p>

<p>Move nodes in odd positions to the new linked list.</p>

<p style="text-align:center;"><img height="101" src="https://hrcdn.net/s3_pub/istreet-assets/qlgKjpfFKl9ZcX4bpDeINw/linkedlist%20(1).png" width="717" data-a11y="img-alt" alt="Diagram of two singly-linked lists: New List with nodes 1→2→8, Old List with nodes 5→7→3."></p>

<p>Repeat the process.</p>

<p style="text-align:center;"><img height="101" src="https://hrcdn.net/s3_pub/istreet-assets/6L1sz_PSULYlfbzltXZHmA/linkedlist%20(2).png" width="793" data-a11y="img-alt" alt="Diagram of two linked lists: the new list has nodes 1-2-8-5-3, and the old list has a single node 7."></p>

<p>&nbsp;</p>

<p>With only one node, this is the final iteration. Move the last node to the new list.</p>

<p style="text-align:center;"><img src="https://hrcdn.net/s3_pub/istreet-assets/J8DZhPZlzrFrEI7SDlBuFg/linkedlist%20(3).png" data-a11y="img-alt" alt="Illustration of a new linked list with node values 1-2-8-5-3-7 in sequence."></p>

<p>Return a reference to the head of this list.</p>

<p>&nbsp;</p>

<p class="section-title" data-a11y="p-s-t" role="heading" aria-level="4">Function Description</p>

<p>Complete the function <em>createLinkedList</em> in the editor below.</p>

<p>&nbsp;</p>

<p><em>createLinkedList</em> has the following parameter:</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;head: reference to the head of a linked list of <em>n</em>&nbsp;integers</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Returns</strong></p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;a reference to the head of the final linked list.</p>

<p>&nbsp;</p>

<p data-a11y="p-str" role="heading" aria-level="4"><strong>Constraints</strong></p>

<ul>
	<li><em>1&nbsp;≤ n&nbsp;≤&nbsp;10<sup>5</sup></em></li>
	<li><em>1&nbsp;≤ data ≤&nbsp;10<sup>9</sup></em></li>
</ul>

<p>&nbsp;</p>
<!-- <StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Input Format For Custom Testing</span></summary>

<div class="collapsable-details">
<p>The first line contains an integer <em>n</em>, the number of elements in the list.</p>

<p>Each <em>i</em> of the next <em>n</em> lines contains an integer, the i<sup>th</sup>&nbsp;element of the list.</p>
</div>
</details>
<!-- </StartOfInputFormat> DO NOT REMOVE THIS LINE-->

<details open="open"><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 0</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input For Custom Testing</p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FUNCTION
-----&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--------
5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;list size n = 5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
3&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;list = 3 → 5 → 3 → 7 → 8
5
3
7
8</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output</p>

<pre>3
3
8
5
7</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation</p>

<p>&nbsp;</p>

<ul>
	<li>The new list is&nbsp; 3 → 3&nbsp;→ 8, the old list is 5&nbsp;→ 7.</li>
	<li>3 → 3&nbsp;→ 8&nbsp;→ 5 and&nbsp; 7</li>
	<li>3 → 3&nbsp;→ 8&nbsp;→ 5 → 7 and empty</li>
</ul>

<p>&nbsp;</p>
</div>
</details>

<details><summary class="section-title" data-a11y="d-s"><span data-a11y="d-s-t" role="heading" aria-level="4">Sample Case 1</span></summary>

<div class="collapsable-details">
<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Input For Custom Testing</p>

<pre>STDIN&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;FUNCTION
-----&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--------
4&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;list size n = 4
5&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;list = 5 → 3 → 2 → 7
3
2
7</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Sample Output</p>

<pre>5
2
3
7</pre>

<p class="section-title" data-a11y="d-p-s-t" role="heading" aria-level="5">Explanation</p>

<p>&nbsp;</p>

<ul>
	<li>The new list is&nbsp;5&nbsp;→ 2&nbsp;and the old list is 3&nbsp;→ 7.</li>
	<li>5&nbsp;→ 2&nbsp;→ 3&nbsp;and 7</li>
	<li>5&nbsp;→ 2&nbsp;→ 3 → 7 and empty</li>
</ul>
</div>
</details>
</div>

     * Complete the 'createLinkedList' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST head as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    public SinglyLinkedListNode createLinkedList(SinglyLinkedListNode head) {
        if (head == null) {
            return null;
        }

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode newHead = dummy;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode current = head;
        int index = 1;

        while (current != null) {
            if (index % 2 != 0) {
                newHead.next = current;
                newHead = newHead.next;

                if (prev != null) {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
            index++;
        }

        newHead.next = null;
        return dummy.next;
    }

    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public class SinglyLinkedListPrintHelper {
        public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }
    }
}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        SinglyLinkedList head = new SinglyLinkedList();
//
//        int headCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        IntStream.range(0, headCount).forEach(i -> {
//            try {
//                int headItem = Integer.parseInt(bufferedReader.readLine().trim());
//
//                head.insertNode(headItem);
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        SinglyLinkedListNode result = Result.createLinkedList(head.head);
//
//        SinglyLinkedListPrintHelper.printList(result, "\n", bufferedWriter);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
