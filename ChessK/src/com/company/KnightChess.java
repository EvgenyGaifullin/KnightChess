package com.company;

public class KnightChess {
    public static final int n = 4;
    public static final int m = 4;

    static int findPossibleMoves(int[][] mat, int p, int q)
    {
        int[] X = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int[] Y = { 1, 2, 2, 1, -1, -2, -2, -1 };

        int count = 0;

        for (int i = 0; i < 8; i++) {

            int x = p + X[i];
            int y = q + Y[i];

            if (x >= 0 && y >= 0 && x < n && y < m
                    && mat[x][y] == 0)
                count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[][] mat = { { 1, 0, 1, 0 },
                { 0, 1, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 1 }
        };

        int p = 2, q = 2;

        System.out.println(findPossibleMoves(mat, p, q));
    }
}

