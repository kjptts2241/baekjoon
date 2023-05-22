import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str;
        
        // 문자 입력 입력
        while (true) {
            str = br.readLine();
            
            if (str.length() <= 1000000) break;
            else System.out.println("1000000 이하의 길이의 문자를 입력해주세요");
        }

        // 앞뒤 공백 제거 후 공백 기준으로 자른 단어 배열 저장
        String[] arr = str.trim().split(" ");

        int count = 0; // 단어의 수
        
        for (String s : arr)
            if (!s.equals("")) {
                count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}