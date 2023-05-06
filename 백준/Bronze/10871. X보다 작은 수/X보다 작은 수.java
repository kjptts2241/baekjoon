import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N, X;

        // 입력할 정수의 개수 N, 정수 X 입력
        while(true) {
            N = Integer.parseInt(st.nextToken());
            X = Integer.parseInt(st.nextToken());
            if (1 <= N && X <= 10000) break;
            else System.out.println("1이상의 숫자와 10000이하의 숫자를 입력해주세요");
        }

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int A;

            while(true) {
                A = Integer.parseInt(st.nextToken());

                if (0 <= A && A <= 10000) break;
                else System.out.println("1이상 10000이하의 숫자를 입력해주세요");
            }

            // 수열 A에서 정수가 정수 X보다 크면 저장
            if (A < X) sb.append(A).append(" ");
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
    }
}