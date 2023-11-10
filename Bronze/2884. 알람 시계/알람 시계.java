import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H, M;

        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        if (0 <= H && H <= 23 && 0 <= M && M <= 59) {
            if (M >= 45) M -= 45;
            else {
                if (H == 0) H = 24;
                M = 60 - ((M - 45) * -1);
                H--;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(H + " " + M + "\n");

        bw.flush();
        bw.close();
    }
}
