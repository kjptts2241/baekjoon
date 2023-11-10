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
        
        // 숫자 입력
        while (true) {
            int N = Integer.parseInt(br.readLine());

            if (1 <= N && N <= 100) {

                // 상단
                for(int i = 0; i < N; i++) {
                    for (int j = N-1; j > i; j--) { // 공백 채우기
                        bw.write(" ");
                    }

                    for (int j = 0; j < (i+1)*2-1; j++) { // 별 채우기
                        bw.write("*");
                    }

                    bw.write("\n");
                }

                // 하단
                for (int i = N-1; i > 0; i--) {
                    for (int j = N-1; j >= i; j--) { // 공백 채우기
                        bw.write(" ");
                    }

                    for (int j = 1; j <= i*2-1; j++) { // 별 채우기
                        bw.write("*");
                    }

                    bw.write("\n");
                }
                break;
            }

            else System.out.println("1 이상 100 이하의 숫자를 입력해주세요");
        }

        bw.flush();
        bw.close();
    }
}