package ru.maslov.linkedLists;


import ru.maslov.linkedLists.data.ListNode;

public class ReverseLinkedList2 {
    public static void main(String[] args) {
        ListNode head = ListNode.init(new int[]{1, 2, 3, 4, 5, 6, 7});

        new ReverseLinkedList2().reverseBetween(head, 3, 6);
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || m == n) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevNode = dummy;
        ListNode currNode = dummy.next;

        ListNode subHead = new ListNode(0);
        subHead.next = currNode;

        for (int i = 1; i < n; i++) {
            if (i < m) {
                prevNode = prevNode.next;
                currNode = prevNode.next;
                subHead.next = currNode;
                continue;
            }
            ListNode tmpNext = currNode.next;
            currNode.next = tmpNext.next;
            tmpNext.next = subHead.next;
            subHead.next = tmpNext;
        }

        prevNode.next = subHead.next;
        return dummy.next;
    }

//    public ListNode reverseBetween(ListNode head, int m, int n) {
//        if (head == null || m == n) return head;
//
//        ListNode dummy = new ListNode(0);
//        ListNode prevNode = dummy;
//        prevNode.next = head;
//
//        for (int i = 0; i < m - 1; i++) {
//            prevNode = prevNode.next;
//        }
//
//        ListNode currNode = prevNode.next;
//
//        ListNode subHead = new ListNode(0);
//        subHead.next = currNode;
//
//        for (int i = 0; i < n - m; i++) {
//            ListNode tmpNext = currNode.next;
//            currNode.next = tmpNext.next;
//            tmpNext.next = subHead.next;
//            subHead.next = tmpNext;
//        }
//
//        prevNode.next = subHead.next;
//        return dummy.next;
//    }


//    public ListNode reverseList(ListNode head, Integer endVal) {
//        if (head == null || head.next == null || head.next.val == endVal) return head;
//
//        ListNode node = reverseList(head.next, endVal);
//        ListNode tmpNext = head.next.next;
//        head.next.next = head;
//        head.next = tmpNext != null && tmpNext.val == endVal ? tmpNext : null;
//        return node;
//    }
}
