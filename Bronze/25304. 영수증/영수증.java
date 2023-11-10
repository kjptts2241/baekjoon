import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int a, b, sum = 0;

        if (1 <= X && X <= 1000000000 && 1 <= N && N <= 100) {

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());

                if (1 <= a && a <= 1000000 && 1 <= b && b <= 10) {
                    sum += a * b;
                }
            }

            if (X == sum) bw.write("Yes" + "\n");
            else bw.write("No" + "\n");
        }

        bw.flush();
        bw.close();
    }
}