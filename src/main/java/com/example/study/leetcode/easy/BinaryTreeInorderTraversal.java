package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */
@Component
class BinaryTreeInorderTraversal {
    /**
     * 이진 트리의 루트가 주어졌을 때, 그 노드 값들의 중위 순회를 반환합니다.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root; // 현재 노드를 root로 설정합니다.

        // 현재 노드가 null이 아니거나 스택이 비어 있지 않은 동안 반복합니다.
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                // 현재 노드를 스택에 푸시하고, 현재 노드를 그의 왼쪽 자식으로 이동합니다.
                stack.push(current);
                current = current.left;
            }
            // 스택에서 노드를 팝하고, 그 노드의 값을 결과 리스트에 추가합니다.
            current = stack.pop();
            result.add(current.val);
            current = current.right; // 현재 노드를 그 노드의 오른쪽 자식으로 이동합니다.
        }

        return result;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
