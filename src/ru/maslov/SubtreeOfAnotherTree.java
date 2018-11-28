package ru.maslov;

import java.util.ArrayList;
import java.util.Arrays;

/*
Given tree s:
     3
    / \
   4   5
  / \
 1   2

 Given tree t:
   4
  / \
 1   2

* */

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {


//        System.out.println(new SubtreeOfAnotherTree().isSubtree(
//                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 1, 2))),
//                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(4, 1, 2)))
//        ));
//        System.out.println(new SubtreeOfAnotherTree().isSubtree(
//                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(1, 1))),
//                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(1)))
//        ));
//        System.out.println(new SubtreeOfAnotherTree().isSubtree(
//                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 1, 2, null, null, 0))),
//                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(4, 1, 2)))
//        ));

        System.out.println(new SubtreeOfAnotherTree().isSubtree(
                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 1, null, 2))),
                TreeNode.initTree(0, new ArrayList<Integer>(Arrays.asList(3, 1, 2)))
        ));
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.left != null && s.left.val == t.val) {
            return isSubtree(s.left, t);
        }
        if (s.right != null && s.right.val == t.val) {
            return isSubtree(s.right, t);
        }

        if (s.val == t.val) {
            boolean left = isSubtree(s.left, t.left);
            boolean right = isSubtree(s.right, t.right);
            return left && right;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }


}
