import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 출석번호 배열 생성
        int[] students = new int[30];

        // 출석번호 넣기
        for (int i = 0; i < students.length; i++) {
            students[i] = i + 1;
        }

        // 과제 제출한 학생의 출석번호 입력
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());

            if (1 <= n && n <= 30) {
                // 해당되는 출석번호 0으로 초기화
                for (int x = 0; x < students.length; x++) {
                    if (students[x] == n) students[x] = 0;
                }
            } else System.out.println("출석번호에 해당되는 숫자를 입력해주세요");
        }

        for (int student : students) {
            if (student != 0) bw.write(student + "\n");
        }

        bw.flush();
        bw.close();
    }
}