import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N;
        
        // 숫자의 갯수 입력
        while (true) {
            N = Integer.parseInt(br.readLine());
            
            if (1 <= N && N <= 100) break;
            else System.out.println("1 이상 100 이하의 숫자를 입력해주세요");
        }

        int sum = 0; // 숫자 N개의 합

        while(true) {
            String num = br.readLine();

            // N과 입력한 숫자의 갯수가 같은지 비교
            if (num.length() == N) {
                // 숫자 sum에 한자리씩 더해주기
                for (int i = 0; i < N; i++) {
                    sum += num.charAt(i) - 48;
                }
                break;
            }
            else System.out.println("입력한 갯수만큼 숫자를 입력해주세요");
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
    }
}