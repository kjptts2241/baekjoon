import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];
        Arrays.fill(arr, -1); // 배열 일괄 -1 초기화

        
        // 숫자의 갯수 입력
        while (true) {
            String S = br.readLine();

            // 문자열이 100글자 이하로 조건
            if (S.length() <= 100) {

                // 문자에 'a'(97)를 빼서 나온 인덱스를 가지고 해당 배열 위치에 문자열 위치 번호를 삽입
                for (int i = 0; i < S.length(); i++) {
                    int index = S.charAt(i) - 'a';

                    if (arr[index] == -1) {
                        arr[index] = i;
                    }
                }
                break;
            }

            else System.out.println("단어의 길이가 100을 넘지않게 입력해주세요");
        }

        // 출력
        for (int num : arr) {
            bw.write(num + " ");
        }

        bw.flush();
        bw.close();
    }
}