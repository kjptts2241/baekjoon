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

        // 문자 또는 숫자 하나 입력
        while(true) {
            S = br.readLine();

            // 문자나 숫자가 맞고, 한글자 이하라면 break
            if (S.matches("^[a-zA-Z0-9]*$") && S.length() < 2) break;
            else System.out.println("문자나 숫자를 한 글자로 입력해주세요");
        }

        bw.write((int) S.charAt(0) + "\n");

        bw.flush();
        bw.close();
    }
}