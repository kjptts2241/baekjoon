import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int[] basicChess = {1, 1, 2, 2, 2, 8}; // 기본 체스말
        int[] chess = new int[6]; // 입력 체스말

        // 체스말 입력
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 6; i++) {
                chess[i] = Integer.parseInt(st.nextToken());
            }

            if (0 <= chess[0] && chess[0] <= 10
                    && 0 <= chess[1] && chess[1] <= 10
                    && 0 <= chess[2] && chess[2] <= 10
                    && 0 <= chess[3] && chess[3] <= 10
                    && 0 <= chess[4] && chess[4] <= 10
                    && 0 <= chess[5] && chess[5] <= 10) break;
            else System.out.println("각 말의 갯수를 0 이상 10 이하로 입력해주세요");
        }

        for (int i = 0; i < 6; i++) {
            // 베이직 체스의 말의 개수가 입력한 말의 개수보다 크거나 같을 때
            if (basicChess[i] >= chess[i])
                basicChess[i] -= chess[i];
            // 입력한 말의 개수가 더 클 때
            else if (basicChess[i] < chess[i]) {
                basicChess[i] -= chess[i];
            }
        }

        // 필요한 체스말 개수 출력
        for (int num : basicChess) {
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
    }
}