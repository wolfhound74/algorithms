package ru.maslov.linkedLists;

import ru.maslov.linkedLists.data.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {

    public static void main(String[] args) {
        ListNode list1 = ListNode.init(1, 3, 4, 5);
        ListNode list2 = ListNode.init(2, 4, 7);
        ListNode list3 = ListNode.init(1, 5, 6, 7);

//        ListNode[] lists = new ListNode[]{list1, list2, list3};
        ListNode[] lists = new ListNode[]{null};

//        new MergeKLists().partion(lists, 0, lists.length - 1);
        new MergeKLists().mergeKLists(lists);

    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

        for (ListNode node : lists) {
            if (node == null) continue;
            queue.add(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode node = dummy;

        while (!queue.isEmpty()) {
            ListNode headOfQueue = queue.poll();
            node.next = headOfQueue;

            if (headOfQueue.next != null) {
                queue.offer(headOfQueue.next);
            }

            node = node.next;
        }
        return dummy.next;
    }
}
