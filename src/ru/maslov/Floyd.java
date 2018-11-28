package ru.maslov;

public class Floyd {
    final static int INF = 99999, V = 4;

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, INF, INF},
                {INF, 0, 3, 5},
                {INF, INF, 0, INF},
                {2, INF, 1, 0}
        };

        Floyd a = new Floyd();

        a.floydWarshall(graph);
    }

    void floydWarshall(int graph[][]) {
        int dist[][] = graph.clone();

        int i, j, k;

        for (k = 0; k < V; k++) {
            for (i = 0; i < V; i++) {
                for (j = 0; j < V; j++) {

//                    System.out.println("\nk: " + k + ", i: " + i + ", j: " + j +
//                            "\ndist[i][k]      dist[k][j]      dist[i][j]" +
//                            "\ndist[" + i + "][" + k + "] : " + dist[i][k] +
//                            ", dist[" + k + "][" + j + "] : " + dist[k][j] +
//                            ", dist[" + i + "][" + j + "] : " + dist[i][j]
//                    );

                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
            printSolution(dist);
        }

        // Print the shortest distance matrix
//        printSolution(dist);

    }

    void printSolution(int dist[][]) {
        System.out.println("The following matrix shows the shortest " +
                "distances between every pair of vertices");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
