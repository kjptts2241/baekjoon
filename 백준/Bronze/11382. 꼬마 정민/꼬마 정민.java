import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Long a, b, c;
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(a+b+c + "\n");

        bw.flush();
        bw.close();
    }
}
