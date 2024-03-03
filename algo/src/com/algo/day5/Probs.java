package com.algo.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Probs {

     /*
        Vertex = 7개, Edge = 8개인 그래프가 있을 때,
        다음 8개의 줄에 연결 정보를 제공
        7 8
        1 2
        1 3
        2 4
        2 5
        4 6
        5 6
        6 7
        3 7
      */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] adj; // 2차원 인접행렬
    static int V;       // 노드의 갯수
    static int E;       // 간선의 갯수

    // 그래프 프린트용
    static void print(int[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adj = new int[V + 1][V + 1];    // 인덱스 - 노드번호 매칭 위해서 1칸 넉넉히 잡음

        // 인접행렬 완성

        for (int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start][end] = 1;
            adj[end][start] = 1;
        }
        print(adj);
    }

}
