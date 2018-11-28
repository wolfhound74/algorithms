package ru.maslov;

import ru.maslov.sort.IAlgorithm;

import java.util.Arrays;

public class GreedyKnapsack implements IAlgorithm {
    @Override
    public void execute() {

        Item[] items = {
                new Item(60, 20),
                new Item(100, 50),
                new Item(120, 30)
        };

        Arrays.sort(items);
        System.out.println(Arrays.toString(items));

        double result = 0;
        int weight = 60 ;

        for (Item item : items) {
            if (item.weight <= weight) {
                result += item.cost;
                weight -= item.weight;
                continue;
            }

            result += (double) item.cost * weight / item.weight;
            weight = 0;
            break;
        }

        System.out.println(result);

    }


    class Item implements Comparable<Item> {
        int cost;
        int weight;

        Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public int compareTo(Item o) {
            long r1 = (long) cost * o.weight;
            long r2 = (long) o.cost * weight;

            return -Long.compare(r1, r2);
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }
    }
}
