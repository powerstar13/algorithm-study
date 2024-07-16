package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class BinaryTreeInorderTraversalTest {
    @Autowired
    private BinaryTreeInorderTraversal binaryTreeInorderTraversal;

    @Test
    void example1() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1, null, new BinaryTreeInorderTraversal.TreeNode(2, new BinaryTreeInorderTraversal.TreeNode(3), null));
        assertArrayEquals(new Integer[]{1, 3, 2}, binaryTreeInorderTraversal.inorderTraversal(root).toArray());
    }

    @Test
    void example2() {
        BinaryTreeInorderTraversal.TreeNode root = null;
        assertArrayEquals(new Integer[]{}, binaryTreeInorderTraversal.inorderTraversal(root).toArray());
    }

    @Test
    void example3() {
        BinaryTreeInorderTraversal.TreeNode root = new BinaryTreeInorderTraversal.TreeNode(1);
        assertArrayEquals(new Integer[]{1}, binaryTreeInorderTraversal.inorderTraversal(root).toArray());
    }
}