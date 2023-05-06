import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N;

        // 입력할 정수의 개수 N 입력
        while(true) {
            N = Integer.parseInt(br.readLine());
            if (1 <= N && N <= 1000000) break;
            else System.out.println("1이상 1000000이하의 숫자를 입력해주세요");
        }

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int arr[] = new int[N]; // 배열 생성

        for (int i = 0; i < N; i++) {
            while(true) {
                int A = Integer.parseInt(st.nextToken());

                // 조건에 맞으면 배열에 값 저장
                if (-1000000 <= A && A <= 1000000) {
                    arr[i] = A;
                    break;
                }
                else System.out.println("-1000000이상 1000000이하의 숫자를 입력해주세요");
            }
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (max < num) max = num; // 더 큰 수를 저장
            else if (min > num) min = num; // 더 작은 수를 저장
        }

        bw.write(min + " " + max + "\n");

        bw.flush();
        bw.close();
    }
}