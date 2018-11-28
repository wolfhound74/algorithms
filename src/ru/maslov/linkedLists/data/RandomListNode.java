package ru.maslov.linkedLists.data;

public class RandomListNode {
    public int label;
    public RandomListNode next;
    public RandomListNode random;

    public RandomListNode(int x) {
        label = x;
    }

    @Override
    public String toString() {
        return "" + label;
    }

    public static RandomListNode init(int... nums) {

        RandomListNode dummy = new RandomListNode(0);
        RandomListNode head = dummy;
        for (int i = 0; i < nums.length; i++) {
            RandomListNode node = new RandomListNode(nums[i]);
            head.next = node;
            head = node;
        }
        return dummy.next;
    }
}
