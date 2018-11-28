package ru.maslov;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode tree1 = TreeNode.initTree(0, new ArrayList(Arrays.asList(3, 9, 20, null, null, 15, 7)));
        new MaximumDepthOfBinaryTree().maxDepth(tree1);
    }

    public int maxDepth(TreeNode root) {
        int res = 0;
        if (root == null) {
            return res;
        }

        res = Math.max(maxDepth(root.left), maxDepth(root.right));

        return res + 1;
    }
}
