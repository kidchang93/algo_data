package com.algo.day2;

public class BruteForce {
    static String text = "hello world";
    static String pattern = "rld";
    static int startIdx = -1;   // 찾지 못하는 경우 -1

    public static void main(String[] args) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i < n - m + 1; i++){
            int cnt = 0;
            for (int j = 0; j < m; j++){
                if (text.charAt(i + j) == pattern.charAt(j)){
                    cnt++;
                } else {
                    break;
                }
            }
            if (cnt == m){
                startIdx = i;
                break;
            }
        }
        System.out.println(startIdx);
    }
}
