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
        
        // 테스트 케이스 갯수 입력
        while(true) {
            T = Integer.parseInt(br.readLine());
            
            if (1 <= T && T <= 10) break;
            else System.out.println("1 이상 10 이하의 테스트 케이스를 입력해주세요");
        }

        for (int i = 0; i < T; i++) {
            String str;

            while (true) {
                str = br.readLine();

                // 입력한 문자열과 해당 문자열을 대문자로 변경한 문자열과 같고, 1000보다 작다면 break;
                if (str.equals(str.toUpperCase()) && str.length() <= 1000) break;
                else System.out.println("대문자로 1000글자 이하로 입력해주세요");
            }

            // 문자열의 첫 문자와 마지막 문자 출력
            bw.write(str.charAt(0) + "" + str.charAt(str.length() - 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}