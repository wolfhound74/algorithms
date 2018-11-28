package ru.maslov;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        new BestTimeToBuyAndSellStock().maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        new BestTimeToBuyAndSellStock().maxProfit(new int[]{2, 4, 1, 2, 1, 5});
    }

    public int maxProfit(int[] prices) {
        int res = 0;

        if (prices.length < 2) {
            return res;
        }

        int b = prices[0];
        int s = prices[0];
        int goodPrice = s - b;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < b) {

                b = price;
                s = price;
                continue;
            }

            if (price > s) {
                s = price;

                goodPrice = Math.max(goodPrice, s - b);
            }
        }

        return goodPrice;
    }
}
