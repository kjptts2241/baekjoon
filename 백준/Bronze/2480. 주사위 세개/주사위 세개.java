import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int one, two, three, result = 0;

        one = Integer.parseInt(st.nextToken());
        two = Integer.parseInt(st.nextToken());
        three = Integer.parseInt(st.nextToken());

        if (0 < one && one < 7 && 0 < two && two < 7 && 0 < three && three < 7) {
            // 같은 눈 3개의 경우
            if (one == two && two == three) result = 10000 + one * 1000;
            // 모두 다른 눈의 경우
            else if (one != two && two != three && one != three) {
                result = Math.max(one, two);
                result = Math.max(three, result);
                result *= 100;
            }
            // 같은 눈 2개의 경우
            else if (one == two && two != three && one != three) result = 1000 + one * 100;
            else if (one != two && two == three && one != three) result = 1000 + two * 100;
            else if (one != two && two != three && one == three) result = 1000 + one * 100;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(result + "\n");

        bw.flush();
        bw.close();
    }
}