package ru.maslov.recursion;

import ru.maslov.linkedLists.data.ListNode;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode list1 = ListNode.init(1, 2, 3, 4, 5);

        new SwapPairs().swapPairs(list1);
    }

    private ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode tmp = head.next;

        head.next = swapPairs(tmp.next);
        tmp.next = head;

        return tmp;
    }
}
