import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int maxNum = -1_000_001; // 최댓값 갱신용
    static int minNum = 1_000_001;
    static int N;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 배열로 만들어 sort를 하거나 배열을 돌면서 찾기보다 토큰상태에서 바로!
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, num);
            minNum = minNum > num ? num : minNum; // Math.min을 권장합니다.
        }
        System.out.print(minNum + " ");
        System.out.println(maxNum);
    }
}
