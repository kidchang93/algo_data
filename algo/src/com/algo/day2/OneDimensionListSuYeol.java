package com.algo.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OneDimensionListSuYeol {

    // 최대값을 저장할 변수
    static int maxTemp;

    // 전체 구간 N개, 타겟 구간 K
    static int N, K;

    // BufferedReader를 통한 입력 처리
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        // 첫 줄에서 N과 K를 읽어옴
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        // 두 번째 줄에서 공백으로 구분된 N개의 온도 값을 배열로 변환
        int[] temperatures = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // 타겟 구간의 초기 합을 계산
        int acc = 0;
        for (int i = 0; i < K; i++) {
            acc += temperatures[i];
        }
        maxTemp = acc;  // 일단 처음 K개의 값을 초기 값으로 설정

        // 슬라이딩 윈도우 기법을 이용하여 최대 합을 계산
        for (int i = 0; i < N - K; i++) {
            acc = acc - temperatures[i] + temperatures[i + K];
            maxTemp = Math.max(maxTemp, acc);
        }

        // 최대 합 출력
        System.out.println(maxTemp);
    }
}
