import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int result, A, B;
        
        // 숫자 입력
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            // A와 B가 세 자리 수인지 확인
            if ((int)(Math.log10(A)+1) == 3 && (int)(Math.log10(B)+1) == 3) break;
            else System.out.println("두개의 세 자리 숫자를 입력해주세요");
        }

        // 뒤집은 두개의 숫자중 큰 숫자 비교
        result = Math.max(reverse(A), reverse(B));

        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }

    // 숫자 뒤집기 함수
    public static int reverse(int n) {
        int answer = 0;

        while (n != 0) {
            // n을 10으로 나눈 나머지를 더해주는데, answer에 10을 곱해줘서 자릿수를 넘겨준다
            answer = answer * 10 + n % 10;
            // n을 10으로 나눠서 한자리씩 빼준다
            n /= 10;
        }
        return answer;
    }
}