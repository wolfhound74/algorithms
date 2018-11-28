package ru.maslov;

public class JumpingOnClouds {
    public static void main(String[] args) {
        jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0});

    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int cloudsSize = c.length;

        int jumps = 0;
        int maxStep = 2;

        int i = 0;
        while (i < cloudsSize - 1) {
            int jumpTo = 0;
            for (int j = 1; j <= maxStep; j++) {
//                if (i + j == cloudsSize) {
//                    i++;
//                    break;
//                }

                if (c[i + j] == 0) {
                    jumpTo = j;
                }
            }

            if (jumpTo > 0) {
                jumps++;
            }
            i += jumpTo;
        }

        return jumps;
    }
}
