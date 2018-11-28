package ru.maslov;

import java.util.ArrayList;
import java.util.Arrays;

public class SameTree {
    public static void main(String[] args) {
        TreeNode tree1 = TreeNode.initTree(0, new ArrayList(Arrays.asList(1, 2, 3)));
        TreeNode tree2 = TreeNode.initTree(0, new ArrayList(Arrays.asList(1, 2, 3)));

        new SameTree().isSameTree(tree1, tree2);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
