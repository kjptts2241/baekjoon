import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N, M;

        // 바구니 갯수와 공을 바꿀 횟수 입력
        while(true) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if (1 <= N && N <= 100 && 1 <= M && M <= 100) break;
            else System.out.println("1이상 100이하의 숫자를 입력해주세요");
        }

        // N개의 바구니 생성
        int[] baskets = new int[N];

        // 바구니 번호에 맞는 공 하나 넣어주기
        for (int i = 0; i < baskets.length; i++) {
            baskets[i] = i + 1;
        }

        // 바구니의 공을 M번 교체
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int ball_1 = Integer.parseInt(st.nextToken());
            int ball_2 = Integer.parseInt(st.nextToken());

            while(true) {
                if (1 <= ball_1 && ball_1 <= ball_2 && ball_2 <= N) break;
                else System.out.println("공을 교환할 바구니 두개를 입력해주세요");
            }

            // 서로의 바구니의 볼을 교체
            int tem;
            tem = baskets[ball_1 - 1];
            baskets[ball_1 - 1] = baskets[ball_2 - 1];
            baskets[ball_2 - 1] = tem;
        }

        StringBuilder sb = new StringBuilder();

        for (int basket : baskets) {
            sb.append(basket).append(" ");
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
    }
}