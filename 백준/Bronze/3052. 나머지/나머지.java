import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 나눠줄 입력 값 배열 생성
        int[] numbers = new int[10];
        int count = 0; // 서로 다른 값 갯수

        // 입력 값 넣기
        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());

            while (true) {
                if (0 <= A && A <= 1000) {
                    numbers[i] = A;
                    break;
                } else System.out.println("음수가 아닌 1000 이하의 숫자를 입력해주세요");
            }
        }

        // 42로 나눈 값을 배열에 새로 초기화
        for (int i = 0; i < 10; i++) {
            numbers[i] = numbers[i] % 42;
        }

        // 서로 다른 값 구하기
        // 한칸씩 앞으로 비교하면서 중복 값 을 찾기
        for (int i = 0; i < 10; i++) {
            int tmp = 0;
            for (int j = i+1; j < 10; j++) {
                if (numbers[i] == numbers[j]) tmp++;
            }
            
            // 중복 값이 없다면 count 증가
            if (tmp == 0) count++;
        }

        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}