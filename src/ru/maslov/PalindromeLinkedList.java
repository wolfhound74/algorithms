package ru.maslov;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;
        node4.next = node5;
        node5.next = null;

        new PalindromeLinkedList().isPalindrome(node1);
    }

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        return list.size() > 0 ? isPalindrome(list) : false;
    }

    boolean isPalindrome(ArrayList list) {
        int i = 0;
        int j = list.size() - 1;

        while (i <= j) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }


}

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "" + val;
    }
}
