import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N, v, result = 0;

        // 입력할 정수의 개수 N 입력
        while(true) {
            N = Integer.parseInt(br.readLine());
            if (0 < N && N < 101) break;
            else System.out.println("1에서 100 사이의 숫자를 입력해주세요");
        }

        int[] vArr = new int[N]; // 배열 생성
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        // 배열에 입력한 정수 저장
        for (int i = 0; i < N; i++) {
            vArr[i] = Integer.parseInt(st.nextToken());
        }

        // N개의 정수 중에 v가 몇개 있는지 출력
        v = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (vArr[i] == v) result += 1;
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }
}