package ru.maslov.sort;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {
        numTrees(3);
    }

    static public int numTrees(int nx) {
        int[] G = new int[nx + 1];
        G[0] = 1;
        G[1] = 1;

        for (int n = 2; n <= nx; n++) {
            for (int i = 1; i <= n; i++) {
                int r = G[i - 1] * G[n - i];
                G[n] += r;
            }
        }
        return G[nx];
    }
}
