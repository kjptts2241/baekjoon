import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder("int");

        if (4 <= N && N <= 1000 && N % 4 == 0) {

            int number = N/4;

            for (int i = 0; i < number; i++) {
                sb.insert(0, "long ");
            }
        }

        bw.write(sb + "\n");

        bw.flush();
        bw.close();
    }
}