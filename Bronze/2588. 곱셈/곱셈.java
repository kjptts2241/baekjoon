import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a, b;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(a*(b%10) + "\n");
        bw.write(a*(b%100/10) + "\n");
        bw.write(a*(b/100) + "\n");
        bw.write(a*b + "\n");
        
        bw.flush();
        bw.close();
    }
}
