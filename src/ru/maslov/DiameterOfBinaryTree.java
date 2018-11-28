package ru.maslov;

import java.util.ArrayList;
import java.util.Arrays;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
//        TreeNode tree = TreeNode.initTree(0, new ArrayList(Arrays.asList(1, 2, 3)));
//        TreeNode tree = TreeNode.initTree(0, new ArrayList(Arrays.asList(1, 2, 3, 4, 5)));
        TreeNode tree = TreeNode.initTree(0, new ArrayList(Arrays.asList(1)));
        new DiameterOfBinaryTree().diameterOfBinaryTree(tree);

    }

    int sum = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        sum = 1;
        exec(root);
        return sum -1 ;
    }

    private int exec(TreeNode root) {
        if (root == null) return 0;


        int left = exec(root.left);
        int right = exec(root.left);

        sum = Math.max(sum, left + right);

        return Math.max(left, right) + 1;
    }
}
