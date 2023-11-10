import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x, y, result;

        while (true) {
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());
            if (x != 0 && y != 0)
                if (-1000 <= x && x <= 1000 && -1000 <= y && y <= 1000) break;
                else System.out.println("-1000 이상 1000 이하의 숫자를 입력해주세요");
            else System.out.println("0은 입력하지 못합니다.");
        }

        if (x > 0 && y > 0) result = 1;
        else if (x < 0 && y > 0) result = 2;
        else if (x < 0 && y < 0) result = 3;
        else result = 4;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }
}
