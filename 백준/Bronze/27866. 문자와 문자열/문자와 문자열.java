import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String S = br.readLine();;
        int i;
        
        // 정수 입력
        while(true) {
            i = Integer.parseInt(br.readLine());
            
            if (1 <= i && i <= S.length()) break;
            else System.out.println("1 이상 입력한 문자의 수 이하의 정수를 입력해주세요");
        }

        // 입력한 정수 번째 문자 추출
        bw.write(S.charAt(i-1) + "\n");

        bw.flush();
        bw.close();
    }
}