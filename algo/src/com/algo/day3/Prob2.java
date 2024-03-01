package com.algo.day3;

public class Prob2 {
    public static void main(String[] args) {
        int[][] matrix = {{3, 7, 9}, {4, 2, 6}, {8, 1, 5}};
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(matrix[c][r]); // 348721965
            }
        }
    }
}
