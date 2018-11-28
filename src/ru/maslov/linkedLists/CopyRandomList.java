package ru.maslov.linkedLists;

import ru.maslov.linkedLists.data.RandomListNode;

import java.util.HashMap;

public class CopyRandomList {
    HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

    public static void main(String[] args) {
        RandomListNode node = RandomListNode.init(1, 3, 4);

        new CopyRandomList().copyRandomList(node);
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;

        if (map.containsKey(head)) {
            return map.get(head);
        }

        RandomListNode newNode = new RandomListNode(head.label);
        map.put(head, newNode);

        newNode.next = copyRandomList(newNode.next);
        newNode.random = copyRandomList(head.random);

        return newNode;
    }
}
