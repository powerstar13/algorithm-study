package com.example.study.leetcode.easy;

import org.springframework.stereotype.Component;

/**
 * https://leetcode.com/problems/same-tree/description/
 */
@Component
class SameTree {

    /**
     * 두 개의 이진 트리의 루트가 주어졌을 때, 두 트리가 같은지 아닌지를 확인하는 함수를 작성하세요.
     * 구조적으로 동일하고 노드의 값이 같은 경우, 두 이진 트리는 같은 것으로 간주됩니다.
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        // 두 노드의 값이 같다면, 두 노드의 왼쪽 자식과 오른쪽 자식을 각각 비교하기 위해 isSameTree 메서드를 재귀적으로 호출합니다. 이때, 왼쪽 자식 노드들의 비교 결과와 오른쪽 자식 노드들의 비교 결과가 모두 true여야만 두 트리가 같은 것으로 간주됩니다.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
