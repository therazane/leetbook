package com.leetbook.test.tree;

/**
 * @Auther: kevin3046@163.com
 * @Date: 2021/2/24 13:59
 * @Description:
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
