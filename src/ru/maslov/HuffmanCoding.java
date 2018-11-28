package ru.maslov;

import ru.maslov.sort.IAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCoding implements IAlgorithm {
    private String str;

    public HuffmanCoding(String str) {
        this.str = str;
    }

    @Override
    public void execute() {


        Map<Character, Integer> chars = new HashMap<>();
        for (Character c : str.toCharArray()) {
            chars.merge(c, 1, (a, b) -> a + b);
        }

        Map<Character, LeafNode> charNodes = new HashMap<>();
        PriorityQueue<Node> nodes = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            LeafNode leafNode = new LeafNode(entry.getKey(), entry.getValue());
            charNodes.put(entry.getKey(), leafNode);
            nodes.add(leafNode);
        }

        while (nodes.size() > 1) {
            Node leftNode = nodes.poll();
            Node rightNode = nodes.poll();

            InternalNode node = new InternalNode(leftNode, rightNode);
            nodes.add(node);
        }
        Node root = nodes.poll();
        String rootCode = chars.size() > 1 ? "" : "0";
        root.buildCode(rootCode);

        StringBuilder result = new StringBuilder();
        for (Character c : str.toCharArray()) {
            result.append(charNodes.get(c).code);
        }
        System.out.println(result.toString());
    }

    class Node implements Comparable<Node> {
        int count;

        @Override
        public int compareTo(Node o) {
            return 0;
        }

        public Node(int count) {
            this.count = count;
        }

        void buildCode(String code) {

        }
    }

    class LeafNode extends Node {
        Character symbol;
        String code;

        public LeafNode(Character symbol, Integer count) {
            super(count);
            this.symbol = symbol;
        }

        void buildCode(String code) {
            this.code = code;
            System.out.println(code);
        }
    }

    class InternalNode extends Node {
        Node leftNode;
        Node rightNode;

        public InternalNode(Node leftNode, Node rightNode) {
            super(leftNode.count + rightNode.count);
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        void buildCode(String code) {
            leftNode.buildCode(code + "0");
            rightNode.buildCode(code + "1");
        }
    }
}
