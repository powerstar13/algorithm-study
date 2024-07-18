package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SymmetricTreeTest {
    @Autowired
    private SymmetricTree symmetricTree;

    @Test
    void example1() {
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
        root.left = new SymmetricTree.TreeNode(2);
        root.right = new SymmetricTree.TreeNode(2);
        root.left.left = new SymmetricTree.TreeNode(3);
        root.left.right = new SymmetricTree.TreeNode(4);
        root.right.left = new SymmetricTree.TreeNode(4);
        root.right.right = new SymmetricTree.TreeNode(3);

        assertTrue(symmetricTree.isSymmetric(root));
    }

    @Test
    void example2() {
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(1);
        root.left = new SymmetricTree.TreeNode(2);
        root.right = new SymmetricTree.TreeNode(2);
        root.left.right = new SymmetricTree.TreeNode(3);
        root.right.right = new SymmetricTree.TreeNode(3);

        assertFalse(symmetricTree.isSymmetric(root));
    }
}