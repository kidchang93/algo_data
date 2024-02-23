package com.algo.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String word;
    static String reversedWord;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //방법 1 : for 루프를 통해 반대로 이어붙이고 회문인지 아닌지 확인한다.
        word = br.readLine();   // 입력받는 문자열

        StringBuilder sb = new StringBuilder(); // 스트링빌더 활용 ( 인스턴스 생성 )
        for (int i = word.length() - 1; i >= 0; i--){
            sb.append(word.charAt(i));  // 거꾸로 하나씩 넣고
        }
        reversedWord = sb.toString();   // 스트링으로 변환? ( 문자열 합치기 )

        if (!word.equals(reversedWord)){    // 두 문자가 같지 않다면
            System.out.println(0);  // 0을 출력
        } else {
            System.out.println(1);  // 맞으면 1을 출력 ( 회문임 )
        }


    }
}
