package ru.maslov.linkedLists;

import ru.maslov.linkedLists.data.ListNode;

public class MergeTwoSortedLinkedLists {
    public static void main(String[] args) {
        ListNode list1 = ListNode.init(new int[]{1, 3, 4, 5});
        ListNode list2 = ListNode.init(new int[]{2, 4, 7});

        new MergeTwoSortedLinkedLists().mergeTwoLists(list1, list2);
    }

    private ListNode mergeTwoLists(ListNode fNode, ListNode sNode) {
        if (fNode == null) return sNode;
        if (sNode == null) return fNode;

        if (fNode.val < sNode.val) {
            fNode.next = mergeTwoLists(fNode.next, sNode);
            return fNode;
        } else {
            sNode.next = mergeTwoLists(fNode, sNode.next);
            return sNode;
        }

    }

}
