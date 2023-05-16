import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String S;
        
        // 정수 입력
        while(true) {
            S = br.readLine();
            
            if (S.length() <= 100) break;
            else System.out.println("1 이상 입력한 문자의 수 이하의 정수를 입력해주세요");
        }

        // 문자 길이
        bw.write(S.length() + "\n");

        bw.flush();
        bw.close();
    }
}