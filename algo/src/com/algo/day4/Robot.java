package com.algo.day4;

public class Robot {
    static int x = 0, y = 0, d = 1_000_000;     // 100만이라는 건 디렉션이 0 이라는 뜻. ( 4로 나눈 나머지가 0 ) 값이 0인 것과 다름 없음.
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    static int[] solution(String command) {
        for (int i = 0; i < command.length(); i++) {
            String move = String.valueOf(command.charAt(i)); // 하나의 커맨드
            if (move.equals("R")) {
                d++;
            } else if (move.equals("L")) {
                d--;
            } else if (move.equals("G")) {
                x += dx[d % 4];
                y += dy[d % 4];
            } else if (move.equals("B")) {
                x -= dx[d % 4];
                y -= dy[d % 4];
            }
        }
        return new int[] {x, y};
    }
}
