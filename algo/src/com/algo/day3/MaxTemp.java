package com.algo.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxTemp {

    static int maxNum;
    static int maxR;
    static int maxC;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        for (int r = 0; r < 9 ; r++){ // 행 우선 순회
            StringTokenizer st = new StringTokenizer(br.readLine());    // 한줄 받은 다음
            for (int c = 0; c < 9; c++){
                int num = Integer.parseInt(st.nextToken());
                if (maxNum < num){
                    maxNum = num;
                    maxR = r;
                    maxC = c;

                }
            }
        }
        System.out.println(maxNum);
        System.out.printf("%d %d", maxR + 1 , maxC + 1);
    }
}
