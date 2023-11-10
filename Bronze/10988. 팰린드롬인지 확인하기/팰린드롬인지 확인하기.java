import java.io.*;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자 입력
        while (true) {
            String str = br.readLine();

            if (1 <= str.length() && str.length() <= 100) {
                int result = isPalindrome(str); // 팰린드롬 함수 실행
                bw.write(result + "\n"); // 결과 출력
                break;
            }

            else System.out.println("1 이상 100 글자 이하의 문자를 입력해주세요");
        }

        bw.flush();
        bw.close();
    }

    public static int isPalindrome(String str) {
        String[] strArr = str.split(""); // 문자열 나누기

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        // 스택과 큐에 문자열들 삽입
        for (String s : strArr) {
            stack.push(s); // 스택에 문자 삽입
            queue.add(s); // 큐에 문자 삽입
        }

        // 스택이 빌 때까지 큐와 비교
        while (!stack.isEmpty() && stack.pop().equals(queue.poll())) {}

        // 스택이 비었다면 팰린드롬 o, 남아있다면 팰린드롬 x
        if (stack.isEmpty()) return 1;
        else return 0;
    }
}