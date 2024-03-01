package com.algo.day3;

import java.util.Arrays;

public class Prob3 {
    static int[][] matrix = {{3, 7, 9}, {4, 2, 6}, {8, 1, 5}};

    // swap 로직 따로 작성
    static void swap(int x, int y) {
        int temp = matrix[x][y];
        matrix[x][y] = matrix[y][x];
        matrix[y][x] = temp;
    }

    public static void main(String[] args) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (r > c) { // 이 경우만
                    swap(r, c); // 스왑 진행
                }
            }
        }
        // print
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
