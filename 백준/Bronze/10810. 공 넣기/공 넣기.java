import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N, M;

        // 바구니 갯수와 공을 넣을 갯수 입력
        while(true) {
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if (1 <= N && N <= 100 && 1 <= M && M <= 100) break;
            else System.out.println("1이상 100이하의 숫자를 입력해주세요");
        }

        // N개의 바구니 생성
        int[] baskets = new int[N];

        // 공을 M번 바구니에 넣기
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            while(true) {
                if (1 <= start && start <= end && end <= N && 1 <= ball && ball <= N) break;
                else System.out.println("시작 바구니와 마지막 바구니, 바구니에 넣을 공을 입력해주세요");
            }

            // 해당하는 바구니에 볼을 넣어주기
            for (int i = start-1; i <= end-1; i++) {
                baskets[i] = ball;
            }
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