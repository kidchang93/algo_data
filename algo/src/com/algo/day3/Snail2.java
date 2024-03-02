package com.algo.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail2 {
    static int N;
    static int target;
    static int[][] snail;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dr = {1, 0, -1, 0}; // 하 우 상 좌 방향 세팅
    static int[] dc = {0, 1, 0, -1}; // 0  1  2  3  방향이라 가정
    static int r = -1, c = 0, d = 0; // 초기 달팽이의 좌표는 0, 하방향부터 시작
    static int targetR = 0, targetC = 0; // 구하고자 하는 숫자의 좌표값
    static StringBuilder sb = new StringBuilder();

    static void print(int[][] graph) {
        for (int r = 0; r < graph.length; r++) {
            for (int c = 0; c < graph.length; c++) {
                if (target == snail[r][c]) {
                    targetR = r + 1;
                    targetC = c + 1;
                }
                sb.append(snail[r][c] + " ");
            }
            sb.append("\n");
        }
        sb.append(targetR + " " + targetC);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());
        snail = new int[N][N]; // 달팽이 크기 결정 + 0으로 모두 초기화
        int num = N*N;

        for (int i = N*2; i > 1; i--) {
            for (int j = 0; j < i/2; j++) {
                r += dr[d % 4];
                c += dc[d % 4];
                snail[r][c] = num;
                num--;
            }
            d++;
        }

        print(snail);
    }
}

