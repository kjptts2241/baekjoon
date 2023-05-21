import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T;
        
        // 테스트 케이스 입력
        while (true) {
            T = Integer.parseInt(br.readLine());
            
            if (1 <= T && T <= 1000) break;
            else System.out.println("1 이상 1000 이하의 숫자를 입력해주세요");
        }

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 문자와 반복횟수 입력
        while (true) {
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine(), " ");

                int repeat = Integer.parseInt(st.nextToken()); // 반복횟수 입력
                String str = st.nextToken(); // 문자 입력

                // repeat(1 ≤ repeat ≤ 8) && str(1 ≤ str ≤ 20)
                if (1 <= repeat && repeat <= 8 && 1 <= str.length() && str.length() <= 20) {
                    
                    // 문자 반복 및 수정
                    for(int j = 0; j < str.length(); j++) {
                        for (int k = 0; k < repeat; k++) {
                            sb.append(str.charAt(j));
                        }
                    }
                    sb.append("\n");
                }
                else System.out.println("(1 ≤ 반복횟수 ≤ 8)와 (1 ≤ 문장의 길이 ≤ 20)에 맞춰 입력해주세요");
            }
            break;
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
    }
}