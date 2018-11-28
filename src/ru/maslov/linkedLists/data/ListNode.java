package ru.maslov.linkedLists.data;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "" + val;
    }

//    public static ListNode init(int[] nums) {
//
//        ListNode dummy = new ListNode(0);
//        ListNode head = dummy;
//        for (int i = 0; i < nums.length; i++) {
//            ListNode node = new ListNode(nums[i]);
//            head.next = node;
//            head = node;
//        }
//        return dummy.next;
//    }

    public static ListNode init(int... nums) {

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for (int i = 0; i < nums.length; i++) {
            ListNode node = new ListNode(nums[i]);
            head.next = node;
            head = node;
        }
        return dummy.next;
    }
}
