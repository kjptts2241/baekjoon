import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S;

        // 문자 입력
        S = br.readLine();

        // 총 시간
        int time = 0;

        // 문자에 'A' 아스키 코드를 빼서 해당하는 숫자는 다이얼(숫자)로 전환
        for (int i = 0; i < S.length(); i++) {
            int num = S.charAt(i) - 'A';

            switch (num) {
                case 0: case 1: case 2:
                    num = 2;
                    break;
                case 3: case 4: case 5:
                    num = 3;
                    break;
                case 6: case 7: case 8:
                    num = 4;
                    break;
                case 9: case 10: case 11:
                    num = 5;
                    break;
                case 12: case 13: case 14:
                    num = 6;
                    break;
                case 15: case 16: case 17: case 18:
                    num = 7;
                    break;
                case 19: case 20: case 21:
                    num = 8;
                    break;
                case 22: case 23: case 24: case 25:
                    num = 9;
                    break;
            }

            // 다이얼(숫자) + 다이얼 돌리는 시간 +1초
            // 총 시간에 더해주기
            time += num + 1;
        }

        // 총 시간 출력
        bw.write(time + "\n");

        bw.flush();
        bw.close();
    }
}