import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        if (1 <= n && n <= 10000) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }

        bw.write(sum + "\n");

        bw.flush();
        bw.close();
    }
}