import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[9]; // 배열 생성

        // 정수 입력
        for (int i = 0; i < 9; i++) {
            while(true) {
                int N = Integer.parseInt(br.readLine());

                // 조건에 맞으면 배열에 값 저장
                if (N < 100) {
                    arr[i] = N;
                    break;
                }
                else System.out.println("100보다 작은 숫자를 입력해주세요");
            }
        }

        int max = arr[0]; // 최대값
        int index = 1; // 몇 번째 수

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i]; // 더 큰 수를 저장
                index = i+1; // 해당 인덱스 + 1 저장
            }
        }

        bw.write(max + "\n");
        bw.write(index + "\n");

        bw.flush();
        bw.close();
    }
}