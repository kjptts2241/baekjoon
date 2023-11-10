import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;

        while (true) {
            N = Integer.parseInt(br.readLine());

            if (1 <= N && N <= 100) break;
            else System.out.println("1부터 100사의 숫자를 입력해주세요");
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append("*");
            bw.write(sb.toString() + "\n");
        }

        bw.flush();
        bw.close();
    }
}