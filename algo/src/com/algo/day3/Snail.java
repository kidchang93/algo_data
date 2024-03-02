package com.algo.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail {
    /*
     달팽이는 하(0) -> 우(1) -> 상(2) -> 좌(3) 방향으로 진격
     25 부터 거꾸로 번호를 1씩 깎으면서 채워 넣는다
     달팽이는 일단 방향을 유지한 채로 진격한다.
     달팽이가 방향을 바꾸는 경우는?
     맵 밖으로 가는 경우 -> 방향을 바꿔줘야돼
     맵 안, but 이미 값이 채워져 있는 경우 ->
    */
    static int N;
    static int target;
    static int[][] snail;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] dr = {1,0,-1,0};   // 하 우 상 좌 방향 세팅
    static int[] dc = {0,1,0,-1};   // 0 1 2 3 방향이라 가정
    static int r = 0 , c = 0 , d = 0;   // 초기 달팽이의 좌표는 0, 하방향 부터 시작
    static int targetR = 0, targetC = 0; // 구하고자 하는 숫자의 좌표값
    static StringBuilder sb = new StringBuilder();

    static void print(int[][] graph){
        for (int r = 0; r < graph.length; r++){
            for (int c = 0; c < graph.length; c++){
                if (target == snail[r][c]){
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
        snail = new int[N][N];  // 달팽이 크기 결정 + 0 으로 모두 초기화

        for (int i = N*N; i > 0; i--){
            snail[r][c] = i;    // 달팽이는 맨 처음 밟고 있는 칸에 숫자를 넣음.

            int nr = r + dr[d]; // 그리고 다음 좌표를 일단 계산만 해봄.
            int nc = c + dc[d]; // 여기까진 call 한게 아니니까 인덱스 에러 나지 않음.

            // 만약 새로 구해본 좌표가 맵 밖이거나 새로운 좌표에 이미 어떤 숫자가 있는 경우?
            if (nr < 0 || nr >= N || nc < 0 || nc >= N || snail[nr][nc] != 0 ){
                d = (d + 1) % 4; // 방향을 전환합니다.
                nr = r + dr[d]; // 새로운 좌표는 꺾인 좌표 입니다.
                nc = c + dc[d];
            }

            // 위에서 계산한 좌표를 다음 좌표로 하여 진행합니다.
            r = nr;
            c = nc;
        }
        print(snail);
    }


}
