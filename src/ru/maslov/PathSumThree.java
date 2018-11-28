package ru.maslov;

import java.util.ArrayList;
import java.util.Arrays;

public class PathSumThree {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1));

        PathSumThree cl = new PathSumThree();

        TreeNode head = cl.initTreeNode(0, list);

        cl.pathSum(head, 8);
    }


    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        int res = 0;
        int leftSum = pathSum(root.left, sum - root.val);
        int rightSum = pathSum(root.right, sum - root.val);

        if (leftSum + root.val == sum) {
            res++;
        }
        if (rightSum + root.val == sum) {
            res++;
        }

        return res;
    }


    public TreeNode initTreeNode(Integer i, ArrayList list) {
        if (i == null || i > list.size() - 1 || list.get(i) == null) {
            return null;
        }


        TreeNode leftNode = initTreeNode(i * 2 + 1, list);
        TreeNode rightNode = initTreeNode(i * 2 + 2, list);

        TreeNode head = new TreeNode((Integer) list.get(i));
        head.left = leftNode;
        head.right = rightNode;

        return head;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    static public TreeNode initTree(Integer i, ArrayList list) {
        if (i == null || i > list.size() - 1 || list.get(i) == null) {
            return null;
        }


        TreeNode leftNode = initTree(i * 2 + 1, list);
        TreeNode rightNode = initTree(i * 2 + 2, list);

        TreeNode head = new TreeNode((Integer) list.get(i));
        head.left = leftNode;
        head.right = rightNode;

        return head;
    }

    @Override
    public String toString() {
        return "val=" + val;
    }
}