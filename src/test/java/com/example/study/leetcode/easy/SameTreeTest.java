package com.example.study.leetcode.easy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SameTreeTest {
    @Autowired
    private SameTree sameTree;

    @Test
    void example1() {
        SameTree.TreeNode p = new SameTree.TreeNode(1, new SameTree.TreeNode(2), new SameTree.TreeNode(3));
        SameTree.TreeNode q = new SameTree.TreeNode(1, new SameTree.TreeNode(2), new SameTree.TreeNode(3));
        assertTrue(sameTree.isSameTree(p, q));
    }

    @Test
    void example2() {
        SameTree.TreeNode p = new SameTree.TreeNode(1, new SameTree.TreeNode(2), null);
        SameTree.TreeNode q = new SameTree.TreeNode(1, null, new SameTree.TreeNode(2));
        assertFalse(sameTree.isSameTree(p, q));
    }

    @Test
    void example3() {
        SameTree.TreeNode p = new SameTree.TreeNode(1, new SameTree.TreeNode(2), new SameTree.TreeNode(1));
        SameTree.TreeNode q = new SameTree.TreeNode(1, new SameTree.TreeNode(1), new SameTree.TreeNode(2));
        assertFalse(sameTree.isSameTree(p, q));
    }
}