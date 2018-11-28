package ru.maslov;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7, 1, 1});
        new ContainerWithMostWater().maxArea(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});
    }

    public int maxArea(int[] n) {
        if (n == null) return 0;
        int ri = n.length - 1;

        int bestVolume = 0;

        for (int i = 0; i < n.length; i++) {
            if (i >= ri) break;
            for (int j = ri; j > i; j--) {
                int vol = getVolume(n, i, j);
                if (bestVolume < vol) {
                    ri = j;
                    bestVolume = vol;
                }
            }
        }

        return bestVolume;
    }

    public int getVolume(int[] n, int leftIndex, int rightIndex) {
        int lv = n[leftIndex];
        int rv = n[rightIndex];

        int limit = Math.min(lv, rv);

        return limit * (rightIndex - leftIndex);
    }
}
