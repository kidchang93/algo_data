package com.algo.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Probs2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList[] adj; // 2차원 인접리스트
    static int V;       // 노드의 갯수
    static int E;       // 간선의 갯수

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        // 인접 리스트 초기화
        adj = new ArrayList[V + 1]; // 인덱스 = 노드번호 매칭 위해서 1칸 넉넉히 잡음
        for (int i = 0; i < V + 1; i++){
            adj[i] = new ArrayList<>();
        }

        // 인접리스트 완성
        for (int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            adj[start].add(end);
            adj[end].add(start);
        }
        System.out.println(Arrays.toString(adj));

    }
}
