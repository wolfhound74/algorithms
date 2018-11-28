package ru.maslov.linkedLists;

public class ReverseLinkedList {


    // 1->2->3->4->5->NULL

    public static void main(String[] args) {
        new ReverseLinkedList().exec();
    }

    public void exec() {
        ru.maslov.linkedLists.data.ListNode head = ru.maslov.linkedLists.data.ListNode.init(new int[]{1, 2, 3, 4, 5});

        reverseList(head);
    }


    public ru.maslov.linkedLists.data.ListNode reverseList(ru.maslov.linkedLists.data.ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ru.maslov.linkedLists.data.ListNode node = reverseList(head.next);
        System.out.println(node.val + " " + head.val);
        head.next.next = head;
        head.next = null;
        return node;
    }

}
