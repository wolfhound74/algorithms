package ru.maslov;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertBstToGreaterTree {

    private int sum = 0;

    public static void main(String[] args) {

        TreeNode tree1 = TreeNode.initTree(0, new ArrayList(Arrays.asList(5, 2, 13, 1, 4, 1, 4)));
        new ConvertBstToGreaterTree().convertBST(tree1);
    }

    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            root.val = sum = sum + root.val;
            convertBST(root.left);
        }
        return root;
    }
}
