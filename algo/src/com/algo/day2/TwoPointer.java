package com.algo.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoPointer {
    /* 방법 2 : 투포인터를 사용한다. */
    /* ⇒ 회문인지 검사하고자 하는 스트링의 맨 앞과 뒤에 포인터를 하나씩 설정하고, 안쪽으로 한 칸 씩 좁혀 오면서 검사한다.*/
    /* 이 때, 만약 두 포인터가 가리키는 위치의 문자가 같지 않다면 무조건 회문이 될 수 없으므로 즉시 검사를 중단하며, 최악의 경우에도 완전 탐색보다 반정도의 시간에 목적을 달성할 수 있다.*/

    static String word;
    static int answer = 1;  // 일단 회문이라고 가정하고 1로 설정 ( flag )
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
         /*
         투 포인터에서 화살표는 왜 쓰나? ( 포인터 찍을때 )
         빨간색 : 오른쪽으로 이동
         파란색 : 왼쪽으로 이동
         빨 + 파 위치가 다르게 되는 경우를 하나라도 찾자!
         */

        word = br.readLine();
        for (int i = 0; i <= (word.length() -1 ) / 2; i++){
            if (word.charAt(i) != word.charAt(word.length()-1-i)){
                // 빨간색과 파란색 포인터가 동시에 움직여야됨.
                answer = 0;
                break;
            }
        }
        System.out.println(answer);
    }
}
